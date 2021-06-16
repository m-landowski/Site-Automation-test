
#Do Uruchomienia Testy Wymagane: 
- Adopt Open JDK 11U
- Gradle w wersji 6.8.3 (lub nowsza) 
- Intellij IDEA (Communication Edition / Ultimate)

#Polecenia
* ` gradle :app:VectraRunTest` - Odpalenie testu 

# Struktura
```
├── app -- folder źródłowy
    ├── src -- katalog projektu
        ├── main
            ├── java
                ├── pl.scource.vectra
                    ├──PageObject  -- Klasy bedą zawierały logike testów
                        ├── Menu 
                    ├── MainPage
            ├── Utils - Klasy pomocnicze dla testów: etc. Run Webdriver , Wait To Locator. 
        ├── test
            ├── java    
                ├── pl.scource.vectra -  Zawieta TestCase
            ├── resources 
├── Driver -- folder z WebDriver`ami
     ```
Wynik Prezentacji Testu:
![image](https://user-images.githubusercontent.com/12528895/121078370-2c4ce680-c7d9-11eb-94df-ef488be128d9.png)

Przebieg testu nagrano: https://youtu.be/AsXj4YjORss

