    for(int i = 0 ; i < nums.size() ; i+=2){
        if(i%2 == 0){
            ans.push_back(nums[i]);
        }
    }
    
    for(int j = 1 ; j < nums.size() ; j+=2){
        if(j%2 == 1){
            ans.push_back(nums[j]);
        }
    }
    return ans;
}