echo off
call mvn clean install
call docker image build -t tomcapp -f .\docker\Dockerfile .
call docker run -it --rm -p 8080:8080 -p 9832:9832 --name mytomcapp tomcapp
pause