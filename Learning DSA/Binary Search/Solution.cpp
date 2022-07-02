class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
        
    
  int n = sizeof(arr) / sizeof(arr[0]);
	// Creates a max heap
	priority_queue <int> pq;
	for (int i = 0; i < n; i++) {
        pq.push(arr[i]);
    }

	// One by one extract items from max heap
	
		cout << pq.top();


	return 0;
        
    }
};