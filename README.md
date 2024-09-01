# CATTALK
cattalk
공용 DB 사용 : docker 에 이미지 빌드하고 사용하기
# docker 설정하기 : ROOT 비밀번호 뒤에 각자의 것으로 빌드하기
docker run --name my-mysql-container -e MYSQL_ROOT_PASSWORD=-pw -d -p 3306:3306 mysql:latest

# application.properties 에 작성하는 spring.datasource.url=jdbc:mysql://아이피 적는곳:3306/mydb
docker network inspect cattalkbackend_default 터미널에 입력 후 <br>
Containers > IPv4Address 작성하시오