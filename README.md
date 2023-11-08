Aby uruchomić trzeba najpierw dodać plik do projektu o ścieżce relatywnej src/main/resources/external_config.yml.
W tym pliku trzeba dodać konfiguracje bazy danych i smtp(maile). Wzór na plik:
spring:
    datasource:
        password: <HASLO_BAZY_DANYCH>
        username: <NAZWA_UZYTKOWNIKA>
        url: jdbc:mysql://localhost:3306/<NAZWA_BAZY_DANYCH>?characterEncoding=utf8&useSSL=false
        driverClassName: com.mysql.jdbc.Driver
    mail:
        host: smtp.gmail.com
        port: 587
        username: <EMAIL_ADDRESS>
        password: <APP_PASSWORD>
        properties:
            mail:   
                smtp:
                    auth: true
                    starttls:
                        enable: true