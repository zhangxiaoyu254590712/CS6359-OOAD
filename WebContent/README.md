**Init Project**

- Ues `npm install` to install dependencies

**************
**Install dev dependencies**
- Run 'npm install package-name --save-dev'

**Install prod dependencies**
- Run 'npm install package-name --save'

***********
**Project Structure**

- WebContent
	- app
		- shared (shared component, EG, header, side bar, footer)
		- styles 	 	
	- public (public resources)
		- assets
		- css

*************
- Only run `git pull --rebase` when update
- Run `git checkout -b new_branch -t origin/master` to create a new local branch and track the remote master branch
- Dev on your local branch, before commit, run `git rebase -i` to squash all your commits to one, in vim, input `:%s/pick/s/gc`, type `n` (means pick) for first commit, type `y` (means squash) for the other commits