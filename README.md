## 위드라이브 과제

### 1. 회원 가입을 위한 DB테이블 설계 (mysql)
member_table.ddl

### 2. 회원 관리 API

http://localhost:8080/swagger-ui.html

<table>
    <tr>
        <td>method</td>
        <td>uri</td>
        <td>info</td>
    </tr>
    <tr>
        <td>GET</td>
        <td>/members</td>
        <td>사용자 목록 조회</td>
    </tr>
    <tr>
        <td>GET</td>
        <td>/members/{id}</td>
        <td>사용자 조회</td>
    </tr>
    <tr>
        <td>POST</td>
        <td>/members</td>
        <td>사용자 정보 추가</td>
    </tr>
    <tr>
        <td>PUT</td>
        <td>/members/{id}</td>
        <td>사용자 목록 수정</td>
    </tr>
    <tr>
        <td>DELETE</td>
        <td>/members/{id}</td>
        <td>사용자 목록 삭제</td>
    </tr>
</table>

