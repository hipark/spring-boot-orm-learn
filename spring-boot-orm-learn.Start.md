# spring-boot-orm-learn 실습

## Github Sign up and Github Sign in

1. Gitgub Homepage 접속  
[Github Homepage Link](https://github.com/)  
![Github Homepage](./images/start/Github_Homepage.jpg "Github Homepage")

2. Github Sign up  
![Github Sign up](./images/start/Github_Sign_up.jpg)

3. Github Sign in  
![Github Sign in](./images/start/Github_Sign_in.jpg)

## spring-boot-orm-learn Project Fork
1. spring-boot-orm-learn 프로젝트 접속  
[김지헌 과장님(ihoneymon)의 spring-boot-orm-learn 접속](https://github.com/ihoneymon/spring-boot-orm-learn)  
![ihoneymon-spring-boot-orm-learn](./images/start/ihoneymon-spring-boot-orm-learn.jpg)

2.  Fork  
![spring-boot-orm-learn Fork](./images/start/spring-boot-orm-learn_Fork.jpg)

3. 자신의 Github 계정에 Clone 되었는지 확인  
![Clone 확인](./images/start/Clone_확인.jpg)

## Install Git
1. Git Homepage 접속  
[git-scm Homepage Link](https://git-scm.com/)  
![Git-scm Homepage](./images/start/Git-scm_Homepage.jpg)

2. Git Download  
![Git-scm Homepage](./images/start/Git-scm_Homepage.jpg)

3. Git 설치  
Git-2.7.1.2-64-bit.exe 실행  
    1. Information  
    ![git setup 1](./images/start/git_setup_1.jpg)

    2. Select Components  
    ![git setup 2](./images/start/git_setup_2.jpg)

    3. Adjusting your PATH environment  
    ![git setup 3](./images/start/git_setup_3.jpg)

    4. Configuring the line ending conversions  
    ![git setup 4](./images/start/git_setup_4.jpg)

    5. Configuring the terminal emulator to use with Git Bash  
    ![git setup 5](./images/start/git_setup_5.jpg)

    6. Configuring experimental performance tweaks  
    ![git setup 6](./images/start/git_setup_6.jpg)

    7. Completing the Git Setup Wizard  
    ![git setup 7](./images/start/git_setup_7.jpg)

## Git Clone
1. 자신 계정의 프로젝트 URL Copy  
![hipark-spring-boot-orm-learn URL Copy](./images/start/hipark-spring-boot-orm-learn_URL_Copy.jpg)

2. git clone 명령어
```
//clone 대상 경로에 위치한 후 명령어
git clone https://github.com/hipark/spring-boot-orm-learn.git
```
![git clone](./images/start/git_clone.jpg)

3. git clone 확인  
![git clone 확인](./images/start/git_clone_확인.jpg)

## STS 설치

1. Spring Tool Suite Homepage 접속  
[Spring Tool Suite Homepage Link](https://spring.io/tools)  
![Spring Tool Suite Homepage](./images/start/Spring_Tool_Suite_Homepage.jpg)

2. Spirng Tool Suite Download  
![Spirng Tool Suite Download](./images/start/Spirng_Tool_Suite_Download.jpg)

3. 다운받은 spring-tool-suite-3.7.2.RELEASE-e4.5.1-win32-x86_64.zip 압축 풀고 원하는 장소에 위치 후 실행 + workspace 설정

## Gradle Extention Install
1. STS 첫 화면의 Dashboard 에서 IDE EXTENSIONS 클릭  
![IDE Extention Gradle Install 1](./images/start/IDE_Extention_gradle_install_1.jpg)

2. Gradle (STS Legacy) Support 체크, Install 클릭  
![IDE Extention Gradle Install 2](./images/start/IDE_Extention_gradle_install_2.jpg)

3. Gradle IDE 체크, Next 클릭  
![IDE Extention Gradle Install 3](./images/start/IDE_Extention_gradle_install_3.jpg)

4. Install Details 확인 후 Next  
![IDE Extention Gradle Install 4](./images/start/IDE_Extention_gradle_install_4.jpg)

5. Review Licenses 에서 라이센스 동의  
![IDE Extention Gradle Install 5](./images/start/IDE_Extention_gradle_install_5.jpg)


## spring-boot-orm-learn Project Import
1. Package Exploler View 에서 마우스 우클릭 후 Import -> Gradle Project 선택 후 Next  
![Project Import 1](./images/start/Project_Import_1.jpg)

2. Browse 클릭  
![Project Import 3](./images/start/Project_Import_2.jpg)

3. Root folder 선택  
![Project Import 2](./images/start/Project_Import_3.jpg)

4. Build Model 클릭  
![Project Import 4](./images/start/Project_Import_4.jpg)

5. Build 진행 중  
![Project Import 5](./images/start/Project_Import_5.jpg)

6. Import Gradle Project -> 프로젝트 체크 후 Finish  
![Project Import 6](./images/start/Project_Import_6.jpg)

7. Project Import 확인  
![Project Import 7](./images/start/Project_Import_7.jpg)


## Run Spring Boot App
1. 프로젝트 Context Menu - Run AS - Spring Boot App Click  
![Run Spring Boot App 1](./images/start/Run_Spring_Boot_App_1.jpg)

2. Console 확인  
![Run Spring Boot App 2](./images/start/Run_Spring_Boot_App_2.jpg)

## Install Gradle
1. Gradle Download  
[Gradle Download Page Link](http://gradle.org/gradle-download/)
![Gradle Download Page](./images/start/Gradle_Download_Page.jpg)

2. 압축 해제  
![Unpacking Gradle Zip File](./images/start/Unpacking_Gradle_Zip_File.jpg)

3. 환경 변수 설정  
Path에 `GRADLE_HOME/bin` 추가  
![Environment variables 1](./images/start/Environment_variables_1.jpg)  
![Environment variables 2](./images/start/Environment_variables_2.jpg)

4. 설치 확인  
```
gradle --version
```
![Gradle Installed](./images/start/Gradle_Installed.jpg)

## 실행가능한 jar 파일 생성
1. cmd에서 gradle build 입력
```
gradle build
```
![Gradle_Build](./images/start/Gradle_Build.jpg)

2. Build Successful 확인  
![Gradle_Build_Successful](./images/start/Gradle_Build_Successful.jpg)

3. 해당프로젝트/build/lib 경로에 jar 파일 생성된다.

## jar로 Project 실행
1. `java -jar` 명령어로 Project 실행
```
java -jar springboot-orm-learn-0.0.1-SNAPSHOT.jar
```
![Start Project](./images/start/Start_Project.jpg)

2. 서버 실행 확인  
![Started Project](./images/start/Started_Project.jpg)
