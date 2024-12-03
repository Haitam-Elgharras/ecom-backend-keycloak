# ecom-backend-keycloak


### get access token using client credentials
POST http://localhost:8080/realms/ecom-realm/protocol/openid-connect/token
Content-Type: application/x-www-form-urlencoded

grant_type=password&client_id=ecom-front&username=user1&password=1234


### get access token using refresh token
POST http://localhost:8080/realms/ecom-realm/protocol/openid-connect/token
Content-Type: application/x-www-form-urlencoded

grant_type=refresh_token&client_id=ecom-front&refresh_token=eyJhbGciOiJIUzUxMiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICI3OGMzOGZhOS1kNzg5LTQwNTYtYjliNS0wOTg5ZmRlODQ1OTUifQ.eyJleHAiOjE3MzMxMzYxMjIsImlhdCI6MTczMzEzNDMyMiwianRpIjoiMzJlNThkODEtZTNlNS00OGZhLWEwM2MtNWRjOWVhODQxZmMxIiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwL3JlYWxtcy9lY29tLXJlYWxtIiwiYXVkIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwL3JlYWxtcy9lY29tLXJlYWxtIiwic3ViIjoiN2VmYTlhZDAtMDUxNS00OGRmLTk5NWMtYzZkMDBhM2JlZGRjIiwidHlwIjoiUmVmcmVzaCIsImF6cCI6ImVjb20tZnJvbnQiLCJzaWQiOiI5NmJlYjJhOS1iOGZkLTQ1YmMtOTM5Yy01ZDY2MzFkOWJlNTEiLCJzY29wZSI6IndlYi1vcmlnaW5zIHByb2ZpbGUgYWNyIGJhc2ljIHJvbGVzIGVtYWlsIn0.0Op9oB3Hg0swtV57UD3eDnN_czpQCrqOhpSpyjuTPqFGrZBdvpiSmevnj-1hfaqrmmpMUZTeYqCl1l5E4DYcEg

### get access token using client credentials
- if we activate the client credentials flow in keycloak, we need to provide it in all login requests
POST http://localhost:8080/realms/ecom-realm/protocol/openid-connect/token
Content-Type: application/x-www-form-urlencoded

grant_type=client_credentials&client_id=ecom-front&client_secret=eMIuac6CfV7RrIzaHd51MfHinCrU93Kq
