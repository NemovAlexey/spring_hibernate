Java pre-project. ������ 2.2.1

�������:
��������/����������� ��������� ������� �� ������.
� ������� ���� ������ �� �����������, ������ ����� ����� ���������� � ���� ���� ������� ��� ���������� ������.
������ � ORM.
��� ������ � hibernate ��� ����������� ����������� hibernate-core, ���������� ��������������� �� �������� ���������� ����������� spring-orm.
��� �� ������ ������, ����������� spring-core �������, ��� ��������� ��-�� ����, ��� ��� �������� ���������� ��� ���� ������� ������� � ����������� �� ������ ���.
� ��� ��������� ������ model, service, ������ ������� � DAO ��������� ������ � ������� ��������� @Repository � @Service.
� ������ main ����� ����������� ������������ ����������������� ������ ����������. ����� Car ����������� ��� ����������� �������� hibernate. � AppConfig ������ ������������ ������� ��������� hibernate, ������� ������ �� ����� db.properties. �������� ��������, ��� ��� �� ������ ������������ ��������� @PropertySource("classpath:db.properties"), ������������ � ����� ��������.
�� ���� ��������� ���������� ��������.

�������:
1. �������� ���������� � ����� ���� ������ � �����. ��������� ����������. ���������, ��� ��� ��������� ��������.
2. �������� �������� Car � ������ String model � int series, �� ������� ����� ��������� User � ������� ����� one-to-one.
3. �������� ���� ����� � ��������� hibernate.
4. �������� ��������� ������������� � ��������, �������� �� � ���� ������, �������� �������.
5. � ������ �������� �����, ������� � ������� hql-������� ����� ��������� �����, ���������� ������� �� �� ������ � �����.