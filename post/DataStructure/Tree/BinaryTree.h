//
// Created by Hoxton Ashes on 2025/4/18.
//

#ifndef DATA_STRUCT_BINARYTREE_H
#define DATA_STRUCT_BINARYTREE_H

#include "TreeNode.h"

class BinaryTree {
public:

    BinaryTree();
    void insertNode(int number);
    void preOrder(TreeNode* rootNode);

private:
    TreeNode *rootNode;
    void insertNode(TreeNode* node, int number);
};


#endif //DATA_STRUCT_BINARYTREE_H
