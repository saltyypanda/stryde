# Environment Setup
## Prerequisites
Ensure you have the following tools installed on your system:
- Git
- [Java](https://www.oracle.com/java/technologies/downloads/)
- [Maven](https://maven.apache.org/download.cgi)
- [PostgreSQL](https://www.postgresql.org/download/) (including pgAdmin 4)

VSCode Extensions (optional):
- Spring Boot Extension Pack (VMware)
- Extension Pack for Java (Microsoft)

## Setting Up the Frontend
1. Make sure you have node installed. You can check this by running `node -v` in your terminal. If you don't have node installed, you can download it [here](https://nodejs.org/en/download/).

2. Clone or fork this repository. You can do this by running `git clone https://github.com/rit-sse/WebsiteTheSSEquel.git` in your terminal in the directory you want to clone the repository to.

3. Navigate to the directory you cloned the repository to and run `cd ./frontend`. This will take you to the `frontend` directory, which is where the React application is located.

4. Run `npm install` to install all the dependencies for the project.

## Setting Up a Local Database
1. Open up pgAdmin 4. Click on the `Servers` dropdown in the top left corner and select `PostgreSQL 14`. You might be prompted to enter the password you set for the database superuser.

2. Create a new database by right clicking on `Databases` and selecting `Create > Database...`. Name the database something like `designR1` and click `Save`.

3. Remember your database name, the user, and password for the next step

## Setting Up Your Development Environment
**Application Properties**: Set up your `application.properties` file. This file is not included in the repository because it contains sensitive information. The `application.properties` file should be located in the in the `backend/src/main/resources`, outside of the `activities` directory. The contents of the `application.properties` file should be as follows:

```
spring.datasource.url=jdbc:postgresql://localhost/<DB NAME>
spring.datasource.username=<DB USER>
spring.datasource.password=<DB PASSWORD>
```

The above is just a placeholder, you'll need to fill in each entry with the appropriate information.

## Building the Local Database
If you run the project now, you'll encounter schema errors. This is because the local database hasn't been built. We are still working on this.

That should be it for now! This is a live document and will probably be edited in the future.