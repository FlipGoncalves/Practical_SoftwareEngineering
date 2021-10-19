# docker sem sudo
$ sudo usermod -aG docker $USER
$ reboot

# adicionar e enable do servico
$ sudo systemctl start docker.service
$ sudo systemctl enable docker.service

# Para Manjaro, o primeiro atualiza o linux, depois reiniciamos o PC
$ sudo pacman -Syu 
$ sudo pacman -S docker
$ reboot

# Correr o getting-started da alínea b)d
$ docker build -t getting-started .
$ docker run -dp 3000:3000 getting-started

# Para instalar o docker dashboard e correr em http://localhost:9000
$ sudo pacman -S snapd
$ sudo systemctl enable --now snapd.socket
$ sudo ln -s /var/lib/snapd/snap /snap
$ sudo snap install docker-cli-dashboard --edge
$ docker volume create portainer_data
$ docker run -dp 8000:8000 -p 9000:9000 --name portainer --restart=always -v /var/run/docker.sock:/var/run/docker.sock -v portainer_data:/data portainer/portainer-ce:latest

# Criado Admin com password
Usrename: filipe_admin

# eliminar um container
$ docker stop container_name
$ docker rm container_name

# 1.4 d) em Manjaro
$ sudo pacman -S postgresql
$ sudo passwd postgres
Para entrar no cluster: 
$ sudo su postgres -l # or sudo -u postgres -i initdb --locale $LANG -E UTF8 -D '/var/lib/postgres/data/'
[~$ exit

# 1.4 d) com docker
$ docker pull postgres:latest
$ docker volume create postgres-volume
$ docker run -d --name=postgres13 -p 5432:5432 -v postgres-volume:/var/lib/postgresql/data -e POSTGRES_PASSWORD=[my_pass] postgres
$ docker exec -it postgres13 psql -U postgres

# 1.4 e)
$ docker-compose up
$ docker-compose build
$ docker-compose run web env
$ docker-compose stop