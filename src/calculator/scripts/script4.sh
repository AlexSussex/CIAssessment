echo "Please enter a number to be checked : "
read num
newnum=$((num-1))
i=1

while [ $((i*i)) -lt $newnum ]
do
  let i++
  if [ $(((num/i)*i)) -eq $num ]
  then
      echo "$num is not a prime number"
      echo "Since it is divisible by $i"
      exit 0
  fi
done

echo "$num is a prime number"
