#include<bits/stdc++.h>
using  namespace std;
typedef long long ll;

int main(){
ll applicants,apartments,differance,x=0,y=0;
cin>>applicants>>apartments>>differance;
ll desiredSizeOfApartment[applicants], sizeOfApartment[apartments];
ll matchFound = 0;

for(ll i = 0; i<applicants;i++){
	cin>>desiredSizeOfApartment[i];
}
for(ll j = 0; j<apartments;j++){
	cin>>sizeOfApartment[j];
}

sort(desiredSizeOfApartment,desiredSizeOfApartment+applicants);
sort(sizeOfApartment,sizeOfApartment+apartments);
// Since we have sorted the arrays, we know that the applicants desire 
// a bigger apartment in ascending order and therefore we know that if the apartment is too small
// for the first applicant, then this will apply for everyone else, so we dont have to check for this twice.
// If we have exceeded the upper limit of the applicants requirment, we cant find a match and we will therefore
// help next applicant.


while(x<applicants and y<apartments){
		//if the appartments is too big for the applicant, we cant find a match, help next one.
		if(desiredSizeOfApartment[x]+differance<sizeOfApartment[y]){
			x++;
		}
		//if the appartment is too small, find a bigger one.
		else if(desiredSizeOfApartment[x]-differance>sizeOfApartment[y]){
			y++;
		}
		// if the appartment is in the desired range, we found a match!
		else {
			matchFound++;
			x++;
			y++;
			}
	}

cout<<matchFound;	
}
