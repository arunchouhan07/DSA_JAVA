class Solution{
    public:
    void add(Node* root,int temp,int &sum){
        if(root==NULL){
            sum=max(temp,sum);
            return;
        }
        add(root->left,temp+root->data,sum);
        add(root->right,temp+root->data,sum);
    }
    int maxPathSum(Node* root)
    {
        int temp=0;
        int sum=0;
        add(root,temp,sum);
        return sum;
    }
};