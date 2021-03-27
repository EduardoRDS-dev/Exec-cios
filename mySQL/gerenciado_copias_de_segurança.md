###Gerenciando cópias de segurança

* *Importando banco de dados em charset utf8:*

`mysql -h HOST -u NOME_DO_USUÁRIO -pSENHA_DA_BASE --default_character_set utf8 NOME_DO_DB < arquivo.sql` 

*Atenção! É necessário estar no diretório onde se encontra o seu arquivo.sql.*

* *Exportando banco de dados:*

`mysqldump -h HOST -u NOME_DO_USUÁRIO -p NOME_DO_DB > arquivo.sql`
