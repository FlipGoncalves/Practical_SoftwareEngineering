A) The default lifecycle handles the project deployment. Its main phases are:
    - validate: validate the project is correct and all necessary information is available
    - compile: compile the source code of the project
    - test: test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
    - package: take the compiled code and package it in its distributable format, such as a JAR.
    - integration-test: process and deploy the package if necessary into an environment where integration tests can be run
    - verify: run any checks to verify the package is valid and meets quality criteria
    - install: install the package into the local repository, for use as a dependency in other projects locally
    - deploy: done in an integration or release environment, copies the final package to the remote repository for sharing with other developers and projects.

B) Yes, even if maven is a build tool, its also a software project management and comprehension tool, based on the concept of a project object model (POM).

C) git checkout -b <.new-feature>
   git status
   git add <.some-file>
   git commit
   git push -u origin <.new-feature>

D) The commit message should be concise and straight to the point, if u change a line in a script, you should put the line in the commit message, etc. It also should have the name of the person who commited it so it doesn't confuse the rest of the team. Each message should have an explanation of what you changed/added/deleted, but it can´t be a small message, like three words, nor a long one, it needs to have the required level of detail.

E) For a production database, its better to configure the volume when you start the container, because the default volume for a starting container is very low no space compared to what the database may require.
