cmake_minimum_required(VERSION 3.27)
project(data_struct)

set(CMAKE_CXX_STANDARD 17)

add_executable(data_struct main.cpp
        Tree/TreeNode.cpp
        Tree/TreeNode.h
        Tree/BinaryTree.cpp
        Tree/BinaryTree.h
        Person.cpp
        Person.h
        Tests/BinaryTree/binaryTree.cpp
        Tests/BinaryTree/binaryTree.h
        Tests/BinaryTree/binaryTree.h
        Tests/BinaryTree/binaryTree.h
)

#add_subdirectory(Tree)