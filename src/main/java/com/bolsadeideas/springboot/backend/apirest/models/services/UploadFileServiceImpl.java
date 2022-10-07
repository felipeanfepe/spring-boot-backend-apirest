package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.io.IOException;
import java.io.File;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

@Service
public class UploadFileServiceImpl implements IUploadFileService {

    private final Logger log = LoggerFactory.getLogger(UploadFileServiceImpl.class);
    private final static String DIRECTORIO_UPLOAD = "uploads";

	@Override
	public Resource cargar(String nombreFoto) throws MalformedURLException {

		Path rutaArchivo = this.getPath(nombreFoto);
        log.info(rutaArchivo.toString());

        Resource recurso = new UrlResource(rutaArchivo.toUri());

        if (!recurso.exists() && !recurso.isReadable()) {
            rutaArchivo = Paths.get("src/main/resources/static/images").resolve("no-usuario.png").toAbsolutePath();
            recurso = new UrlResource(rutaArchivo.toUri());
            log.error("Error no se pudo cargar la imagen: " + nombreFoto);
        }
		return recurso;
	}

	@Override
	public String copiar(MultipartFile file) throws IOException {
		String nombreArchivo = UUID.randomUUID().toString() + "_" + file.getOriginalFilename().replace(" ", "");
        Path rutaArchivo = this.getPath(nombreArchivo);
        log.info(rutaArchivo.toString());
        Files.copy(file.getInputStream(), rutaArchivo);
		return nombreArchivo;
	}

	@Override
	public boolean eliminar(String nombreFoto) {
		if (nombreFoto != null && nombreFoto.length() > 0 && !nombreFoto.isEmpty()) {
            Path rutaFotoAnterior = Paths.get("uploads").resolve(nombreFoto).toAbsolutePath();
            File archivoFotoAnterior = rutaFotoAnterior.toFile();
            if (archivoFotoAnterior.exists() && archivoFotoAnterior.canRead()) {
                archivoFotoAnterior.delete();
                return true;
            }
        }
		return false;
	}

	@Override
	public Path getPath(String nombreFoto) {
		return Paths.get(DIRECTORIO_UPLOAD).resolve(nombreFoto).toAbsolutePath();
	}

}
