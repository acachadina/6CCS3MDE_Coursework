# MDE - User Guide to DOT Language Implementation
In order to run a demonstration of the implementation of the language, follow the steps provided below. 
Start by cloning the repository and opening it with the Eclipse IDE. 

### 1. Generate Artifacts

In order to generate artifacts from the abstract syntax of the DOT language, travel to the file ```DotLanguage.xtext```, 
found in the folder ```MDE/DotLanguage/uk.ac.kcl.inf.dot/src/uk/ac/kcl/inf```. 

Left-click on the body of the file and select *__Run As > Generate Xtext Artifacts__*.

### 2. Run as Eclipse Application

In the Eclipse Project Explorer, left-click on the folder ```uk.ac.kcl.inf.dot``` and select *__Run As > Run Configurations__*.

In the pop-up, search for the run cofiguration for *Launch Runtime Eclipse*. 

Under *Workspace Data* in the field *Location*, set the location where you would like to run the Runtime Eclipse. 

After this, click *__Run__* on the bottom right corner of the screen.

### 3. Open Runtime Project Folder

In the Runtime Eclipse window, open the folder ```2021-dot-runtime``` which can be found in the root folder of the project ```MDE```.

### 4. Run Sample Graphs

In order to run the compilation of some sample graphs, left-click on any of the files in ```TestDot/src-gen``` and 
select *__Run As > Java Application__*. This will generate a pop-up with the visualisation of the graphs. 

To view and edit the graphs, travel to ```TestDot/src``` where you will find ```*.dot``` files containing the textual descriptions of the graphs.

