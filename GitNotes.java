1. git init --> To initialize folder as git folder.

2. git add<filename> --> To add file to staging area.
		Note : The files which are added to the staging area are those files which are ready for commit.
3. git commit -m 'msg' --> To commit files which are in staging area to the local repo.

4. git remote add <repo-url> --> To add files to remote repository.

		Note : For first time only we should execute this remote add command. 

git push -u origin master --> It is used to commit changes from local to remote repo.

git Status --> To see staged , un-staged and un-tracked files.
			Staged : Files ready to commit
			Un-Staged : Files not ready to commit
			Un- Tracked : Newly created files.(To be Staged)

git reset --> It is used to un-stage a file.
			Syntax : git reset HEAD <filename>

git checkout --> It is used to discard changes in the working directory
			Syntax : git checkout -- <filename>

git log --> To display commit history.
			Note : For every commit, commit-id will be generated . It contains 40 alphonumeric 
			characters , out of those first 7 chars will be displayed in GitHub.

git diff --> To compare our working file with the repo file.

git stash --> It is used to stash our local changes and makes working tree clean.

git stash apply --> To reload the changes to the files we made before using git stash.

git clone --> To take existing project source code to the local system.
				Syntax : git clone <git-url>
				

BRANCHES IN GIT REPOSITORIES
============================

In GITSHUB we can create repositories for parallel development .

When we create a repository for a project , by default it will be created as Master Branch. 

When you are going to work up on some task (JIRA ID : SBI-102) , create your own feature branch from
Master Branch.

Then clone git repository of feature branch . 

Make your code changes in the feature branch.(Our own playGround)

Once all your changes are completed and tested then you can merge your changes to Master Branch.

To clone git repository to our system we will use the clone command .
			Syntax : git clone <repo-url>		(It will clone the master branch by default)

To clone particular branch from the git repository we will use the command
			Syntax : git clone -b <branch name> <git repo url>
			
After dev and testing completed for our story then we can merge feature branch changes to the 
Master Branch.

To Merge changes from one branch to another , WE WILL PULL REQUEST.