arr=("Aaryan" 5 "Ananya" 34)

echo ${arr[@]:0:2}
unset arr[3]
echo ${arr[*]}
echo ${#arr[@]}
echo ${arr[0]}
echo ${arr[2]:0:3}
echo ${arr[2]:3}

search_result=$(echo "${arr[@]}")

replaced_elements=$(echo "${arr[@]/Aaryan/Mohan}")
echo $replaced_element