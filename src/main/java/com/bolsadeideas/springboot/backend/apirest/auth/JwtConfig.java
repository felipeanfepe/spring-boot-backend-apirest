package com.bolsadeideas.springboot.backend.apirest.auth;

public class JwtConfig {
    public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
    public static final String RSA_PRIVADA = "-----BEGIN PRIVATE KEY-----\r\n"
    		+ "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDoM3+TrSoUAnAW\r\n"
    		+ "aj/y2tciGKmc5YUtCxqV5srPGlaD+GmVp0nJWsp/xAoCfWgZeWPls1Pi5tTeT3ps\r\n"
    		+ "BXenk6Fu/S9Bl3u8Bp9WmNhalIFnzyKzsMxuzEQlvxuIo5wrytwwHK6QFk43cmT3\r\n"
    		+ "KYo+/utS43Qs7OG9sYluZs1Kis2wMeYDH2yYc65wjgUVQbKgoJM9bn3Mp6VoK17J\r\n"
    		+ "Z4B7FL9S63NpQw8C3+M7RfeK4y/WlI3rGh33HTCk5BXRT9Wxfx8Hs8G1m4XCyjo4\r\n"
    		+ "bhLyiinbHtd7yp+nVXmtuPemWGHDZbXoiKrX7e59WmgIBddhMadzQPBPP4NGURi9\r\n"
    		+ "TRO0iSqhAgMBAAECggEACaUj+jwh6JFeWwwASoPtFkE8gGQnR0L0EIB08avYJqSx\r\n"
    		+ "rBH2FmtTSIHZ4ZcYdSBt9htgE2d/tZlLDkQe34LaHIxfQ2P5s4p54WS5be/HvUpl\r\n"
    		+ "GF4ya7LH7OJ2kBMtuEL1qPj0Bk+q4ZI6n+qlj67Skw+YIoqXaOQAP6n9Aojn+NbR\r\n"
    		+ "f30dCWiWjI6p90cGDVGQd9mHOgq3q0UfptGokDTzqodJq5XwSWx+kid4J/Bocz2W\r\n"
    		+ "5PEXoMn6kkBmjCEceIVhhW2qybgxYNXdNk5K0DvVn1bKZcRm2PgAGB54aOkjrQvg\r\n"
    		+ "DrZfh7a6hDnYJJYtFZMPGV698AfW2zzcasUD2ort7QKBgQD+SOEUMrHtpOe/NDhS\r\n"
    		+ "EoccxTRXLNDPiN++b2iQdhhDXy6h4hEcbZuzNJJFr3MO2twuU88/iU16KEfSGOPM\r\n"
    		+ "E1p8FkiDNaFqoBWi52i6KhgrTH2ajvcvXGaNiFnXDYSSvJgjyNaCcZ7CWixO+85K\r\n"
    		+ "vmnvRYChDkY7TRCOPBAL99wUdQKBgQDpxHvAPSq6pU7oYqvq5wzbpB7fQ9mW+/k7\r\n"
    		+ "N5JVJgQvE40HDHZ9uly1gHTMyOHzdDqDCoQb6y4SS4Y1JDNGbPNhEALc8bhQ4G56\r\n"
    		+ "2nu1UNYQ+P9Bbv734wiW4ztjtKKSGEQfLOQ8F8L7/khS44PGrpGVS+3v3yt2R/Fq\r\n"
    		+ "WrxHL1rH/QKBgQCn138Jj/S1wZVeNZ+/PI+GQ/yqVeB2PAhDcNH6GJknTxo+rDNT\r\n"
    		+ "Kl4NSXQLHyW49mlDAvrXG0/Sg+f0G42w1E1zflnakXm8IXJmlowf5U0St2horlkm\r\n"
    		+ "H71pSkjSlA+fs3BQnm5Ip6p86nw4niiqWUkfMCcZJ4zf85wr5iVJYQ8ZSQKBgB/l\r\n"
    		+ "TTVHo0LgN0oB3I8qg1icphG0gkXVj4YC6RZxH3UE5+MkUi6JdQjWxBkE979uBmXG\r\n"
    		+ "04uzpQ+d+mvZyp07VGHT+3AGEy4F0U017lco9mxObRWSfXt5ILzluD68cMoaQYE3\r\n"
    		+ "cNS6MUKMyXV10Y8UVozWVVq7SoTTAB+QzcuwrGRJAoGAAcIAqT/NlbT0nF4XCS1O\r\n"
    		+ "TQTW+ywPPb2Xv/Wtw1flA6rd4U0oVe3g0R9OySpplKMGN5JxU5FXBDdLgHXSPHaT\r\n"
    		+ "LEBZ5Okh9EGNzY0dHj+5tQwnhZrGeTfJel+DoYoX42xsWFfulY5NDZ7pZ29+8621\r\n"
    		+ "IlCevnheU0EvHoLxl5aj22M=\r\n"
    		+ "-----END PRIVATE KEY-----";
    
    public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n"
    		+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA6DN/k60qFAJwFmo/8trX\r\n"
    		+ "IhipnOWFLQsalebKzxpWg/hpladJyVrKf8QKAn1oGXlj5bNT4ubU3k96bAV3p5Oh\r\n"
    		+ "bv0vQZd7vAafVpjYWpSBZ88is7DMbsxEJb8biKOcK8rcMByukBZON3Jk9ymKPv7r\r\n"
    		+ "UuN0LOzhvbGJbmbNSorNsDHmAx9smHOucI4FFUGyoKCTPW59zKelaCteyWeAexS/\r\n"
    		+ "UutzaUMPAt/jO0X3iuMv1pSN6xod9x0wpOQV0U/VsX8fB7PBtZuFwso6OG4S8oop\r\n"
    		+ "2x7Xe8qfp1V5rbj3plhhw2W16Iiq1+3ufVpoCAXXYTGnc0DwTz+DRlEYvU0TtIkq\r\n"
    		+ "oQIDAQAB\r\n"
    		+ "-----END PUBLIC KEY-----";
}
