# LeetCodeSolutions
#Adding an existing project to GitHub using the command line

Simple steps to add existing project to Github.

## 1. Create a new repository on GitHub.
In Terminal, change the current working directory to your local project.

## 2. Initialize the local directory as a Git repository.

	git init

Add the files in your new local repository. This stages them for the first commit.

	git add .

or:

	git add --all

Commit the files that you've staged in your local repository.

	git commit -m 'First commit'


Copy remote repository URL field from your GitHub repository, in the right sidebar, copy the remote repository URL.

In Terminal, add the URL for the remote repository where your local repostory will be pushed.

	git remote add origin <remote repository URL>

Sets the new remote:

	git remote -v

Push the changes in your local repository to GitHub.

	git push origin pull

    git push origin main

Pushes the changes in your local repository up to the remote repository you specified as the origin


## 4. Check modified files
 	git status

## 5.Now add modified files to commit
 	git add src/main/java/com/leetcode/easy/linkedlist/LinkedListCycle.java

## 6.Commit modified files 
 	 git commit -m "commit message"

## 6.1. --amend command is a convenient way to modify the most recent commit

    git commit --amend -m "an updated commit message"


## 7 .If you want to get the list of changed files:
    git show --stat --oneline HEAD 

    git diff-tree --no-commit-id --name-only -r <commit-ish>

## 8. If you want to get the list of all files in a commit, you can use
    git ls-tree --name-only -r <commit-ish>
    git show --stat --oneline HEAD

## 9. If you do not like/want the addition/removal stats, you can replace --stat with --name-only

    git show --name-only --oneline HEAD
    git show --name-only --oneline b24f5fb
    git show --name-only --oneline HEAD^^..HEAD

## 10.Force Push modified files
    git push -u origin +master



