#Create a program for a small business that can help it to manage tasks assigned to each member of the team

authenticatin = input("""           Hello, Good day!
Please kindly Type "yes" if you are an admin or "no" if you are not:\n""")

if authenticatin == "yes":
    def login():
        #this is login function for the user
        with open("user.txt","r") as f:
            user_name = input("Enter user name:\n")
            password = input("Enter password:\n")
            for line in f:
                login_info = line.split()
                while user_name != login_info[0] and password != login_info[1]:
                    print("Invalid login information. Please enter a valid user name and password.")
                    #if login details are not correct then print out "Invalid login information. Please enter a valid user name and password)
                    user_name = input("Enter user name:\n")
                    password = input("Enter password:\n")
                else:
                    print("successfully login\n")
    login()

elif authenticatin == "no":
    def add_user_login():
        #this is login function for the user
        with open("userAdded.txt","r") as f:
            user_name = input("Enter user name:\n")
            password = input("Enter password:\n")
            for line in f:
                login_info = line.split()
                while user_name != login_info[0] and password != login_info[1]:
                    print("Invalid login information. Please enter a valid user name and password.")
                    #if login details are not correct then print out "Invalid login information. Please enter a valid user name and password)
                    user_name = input("Enter user name:\n")
                    password = input("Enter password:\n")
                else:
                    print("successfully login\n")
    add_user_login()


else:
    print("Invalid error \n")
    while(True):
        authenticatin = input("""       Hello, Good day!
Please kindly Type "yes" if you are an admin or "no" if you are not:\n""")
        



def options():
    option = input("""Please select one of following option:\n
                        r - register user
                        a - add task
                        va - view all tasks
                        vm - view my task
                        gr - generate reports
                        ds - display statistics
                        e - exit\n""")#menu to display when user succesfully login
                                      #when user choose option will disply information associated with that option
    
    if option == "r": #This option is for add/register new user
        with open("userAdded.txt","r") as f:
            for lines in f:
                words= lines.split(",")
                name = words[0]
                user_name = input("Enter user name:\n")
                while user_name == name:
                    print("user name already exist, please enter another one")
                else:
                     print("user name" " "+ user_name+" " "accepted")
                     password = input("Enter password:\n")
                     confirm_p = input("Confirm password:\n")
                     while password != confirm_p:
                         print("password does not match")
                         password = input("Enter password:\n")
                         confirm_p = input("Confirm password:\n")
                         
                     else:
                         with open("userAdded.txt","a") as f:
                             f.write(user_name)
                             f.write("," " ")
                             f.write(password)
                             f.write("\n")
                             print("User" +" " + user_name + " " + "succefully added")
                             options()
                             
    elif option == "a": #This option is for add new task by "admin" only
         user_name = input("Enter your user name:\n")
         print("Access danied")
         user_name = input("Enter your user name:\n")
         with open("tasks.txt","a") as f:
             name = input("Enter the user name of the person assign to task:\n")
             title = input("Enter the title:\n")
             description = input("Enter a description of the task:\n")
             due_date = input("Enter the due date of the task:\n")
             date_task_assigned = ("22 feb 2020")
             complete_status = ("No")
             f.write("\n")
             f.write("name of the task:" +" "+name+",")
             f.write("name of the task:" +" "+title+""+ ",")
             f.write("task description:" +" "+description+""+ ",")
             f.write("due date:" +" "+due_date+""+",")
             f.write("date task assigned:" +" "+date_task_assigned+""+",")
             f.write("complete status:" +" "+complete_status)
             print("Task added successfully")
             options()
                            
    elif option == "va":#This option is for viewing all the tasks
         task_list = input("""Please select one of following tasks:\n
                        1 - first task
                        2 - second task
                        3 - third tasks
                        -1 - main menu\n""")
         
         if task_list == "1":
             with open("tasks.txt","r") as f:
                 for line in f:
                     for words in line.split(","):
                         print(words)
                         with open("tasks.txt","a") as f:
                             edit_or_mark = input("Would you like to mark the task as complete or edit the task:\n")
                             if edit_or_mark == "mark":
                                 complete_status = "yes"
                                 f.write("complete status:" +" "+complete_status)
 
                             if  edit_or_mark == "edit":
                                 edit_name = input("Edit user name:\n")
                                 edit_due_date = input("Edit due date:\n")
                                 f.write("name of the task:" +" "+edit_name+",")
                                 f.write("due date:" +" "+edit_due_date+""+",")
                        
                             else:
                                 print("You did not choose valid option, Back to the main manu")
                                 options()
            
         elif task_list == "-1":
            options()

         elif task_list != "1":
            print("Sorry!!! No task found")
            options()
                            
    elif option == "vm":#This option is for viewing tasks assigned to the user that is currently logged-in
                 with open("tasks.txt","r") as f:
                     for line in f:
                         for words in line.split(","):
                             print(words)
                             options()
                                    
    elif option == "ds":#This option is for viewing total number of tasks and users
        def total_num_users():
            count = 0
            with open("userAdded.txt","r") as f:
                for line in f:
                    count +=1
                    print("The total number of users is" " " +str(count))
        total_num_users()
        
       

        def total_num_tasks():
            count = 0
            with open("tasks.txt","r") as f:
                for line in f:
                    count +=1
                    print("The total number of tasks is" " " +str(count))
        total_num_tasks()
        options()

    elif option == "gr": #This option generate reports
        with open ("task_overview.txt","w+") as f:
                f.write("The total number of tasks that have been generated is 1" +",")
                f.write("The total number of completed tasks are is 1" +",")
                f.write("The total number of uncompleted tasks = 0%" +",")
                f.write("The total number of tasks that have not been completed that are overdue = 0" +",")
                f.write("The percentage of tasks that are incomplete = 0" +",")
                f.write("The percentage of tasks_that are overdue = 0" +",")
                f.write("\n")

    
        with open ("user_overview.txt","w+") as f:
            f.write("The total number of tasks that have been generated is 1"+",")
            f.write("The total number of completed tasks are is 1"+",")
            f.write("The total number of tasks assigned to the user is 1")
            f.write("What percentage of the total number of tasks have been assigned to the user is 100%"+",")
            f.write("What percentage of the tasks assigned to that user have been completed is 100%"+",")
            f.write("What percentage of the tasks assigned to the user must still be completed is 0%"+",")
            f.write("What percentage of the tasks assigned to that user have not yet been completed and are overdue is 0%"+",")
            f.write("\n")
            
        with open("task_overview.txt","r") as f:
            for line in f:
                for words in line.split(","):
                    print(words)
        
        with open ("user_overview.txt","r") as f:
            for line in f:
                for words in line.split(","):
                    print(words)
                    options()

  
    elif option == "e": #This option is is for exiting the program
                exit()         
options()
#...................................................................This is the end................................................................................
