# TomcatSpringFrameworkPage

<p>
    Mini-project that I'm writing while learning how to develop microservices with Tomcat and Spring Framework 
    (without Boot) as a way to expand my knowledge on Spring and teach me (and everyone else reading this repository)
    how older Spring applications used to be developed. Hopefully with this, I will learn more about the inner workings 
    of Spring which will help me maintain the legacy code at work.
</p>


<h2>
    How to run:
</h2>
<h4>
    Stack requirements:
</h4>

    Java 8
    Maven
    Docker

<h4>
    Commands:
</h4>
    
    # Create Image:
    docker image build -t tomcapp .
    
    # Run the container:
    docker run -it --rm -p 8080:8080 --name mytomcapp tomcapp
