l# Chatterbox

Contributors:
* Jan Balangue - Lead
* Crandon Riordan
* Chandrika Sinha
# jenkins-startup
This is going to be a web application that allows users to join groups 
called Chatterboxes 
and post related social media content to it.  Roles in the application 
include Chatters, 
Moderators, and Administrators. A Chatterbox is available to any user 
of the app and is 
typically organized around a particular subject.

# Database Structure
![alt text](https://ibb.co/nrMFNU "Logo Title Text 1")

# Description of our RESTful Routes

Chatterbox's API is based on the idea of REST. Chatterbox is comprised of groups. These specific groups will have posts. Like any good social media application we have comments and likes. We're a peaceful project so we're not going to allow dis-liking. Maybe the party parrot emoji, though!

Anyways, here are our routes.


The base resource is group at **/api/groups**. For a specific group **/api/groups/{groupName}**.


To access our posts resources, which is only ever in a group. **/api/groups/{groupName}/posts**.

For votes and comments, **/api/groups/{groupName}/posts/{postId}/comments** and **/api/groups/{groupName}/posts/{postId}/votes**.

