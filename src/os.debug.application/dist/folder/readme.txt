###############
# ��������
###############

# ����IP
OS_ADDR
192.168.1.102

# ·��IP
OS_ROUTE
192.168.1.102:6789

# ���ݿ�IP
OS_DB
192.168.1.102:3306

# ����ֿ��ַ
OS_REPERTORY
D:\repertory

###############
# MySQL
###############
USE mysql;
UPDATE USER SET HOST='%' WHERE USER='root';
FLUSH PRIVILEGES;

###############
# GitHub
###############
https://github.com/ehangogo/coreos.git
ehangogo
yin19921012

###############
# ���ڵ�������
###############


http://localhost:8080/admin/index.html

###############
# ҽ��
###############

# ��ѯ�ӿ�
root:nodes;
root:bundles;
root:store;


# �����������
root:install os.moudel.db.provider.jar 3
root:start os.moudel.db

# ��־���
root:install os.moudel.log.provider.jar 3
root:start os.moudel.log

# �û��������
root:install os.moudel.user.provider.jar 1
root:start os.moudel.user

# �����������
root:install os.moudel.person.provider.jar 1
root:start os.moudel.person

# �໤�����
root:install os.moudel.guard.provider.jar 1
root:start os.moudel.guard

# ҽ��Web���
root:install os.health.application.jar 1
root:start os.health

http://localhost:8083/os.health/login.html

###############
# ��̬����
###############
root:change os.moudel.guard 2

###############
# �쳣�ָ�
###############
root:check

###############
# ��������
###############
root:update os.moudel.log 20

# ���ڵ�
java -jar master.jar
# �ӽڵ�
java -jar slave8081.jar


