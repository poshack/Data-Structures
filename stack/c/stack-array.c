#include<stdio.h>
#include<stdlib.h>
#define capacity 100 //preprocessor macro
//stack limit is 100
void push(int x);
int isFULL();
int isEMPTY();
void pop(void);
void peek(void);
void traverse(void);
int stack[capacity],top=-1;
//works on the principle of lifo 
int main()
{
	int ch,item;
	while(1)
	{
		printf("1:push element\n");
		printf("2:pop element\n");
		printf("3:peek element\n");
		printf("4:Traverse\n");
		printf("5:Quit\n");
		printf("Enter your choice:\n");
	
		scanf("%d",&ch);
		switch (ch)
	{
			case 1: {
				printf("Enter the element you want to add : ");
				scanf("%d",&item);
				push(item);
				break;
				}
			case 2:{
				pop();
				break;
			}
		case 3:{
			peek();
			break;
		}
		case 4:{
			traverse();
			break;
		}
		case 5:{
			exit(0);
		}
		default : printf("Invalid Input!\n\n");
	}
	}
	return 0;
}
void push(int x)
{
	if(isFULL())
	{
		printf("Stack is in overflow!\n");
	} 
	else{
		top++;
		stack[top]=x;
		printf("pushed %d in the stack\n",x);
	}
}
void pop(void){
	if(isEMPTY())
	{
		printf("Stack is in underflow!\n");
	}
	else{
		printf("%d is popped from the Stack\n",stack[top]);
		top--;
	}
}
int isEMPTY()
{
	if(top<0){
		return 1;
	}
	else{
		return 0;
	}
}
int isFULL()
{
	if(top==capacity-1)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}
void peek(void){
	
	if(isEMPTY())
	{
		printf("Stack is Empty!\n");
	}
	else{
		printf("Top element of the stack is %d\n",stack[top]);
	}
}
void traverse(void){
	if(isEMPTY())
	{
		printf("Stack is Empty!\n");
	}
	else{
		printf("Elements in stack :\n");
	for(int v=top;v>=0;v--)
	{
		printf("%d\n",stack[v]);
	}
	}
}