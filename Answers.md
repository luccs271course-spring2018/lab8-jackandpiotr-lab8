Why does FixedArrayQueue require an explicit constructor?
Since it is is an array you have to create it and give it a set capacity.

What happens when you offer an item to a full FixedArrayQueue?
When you offer an item to a full queue it will return false.

What happens when you poll an empty FixedArrayQueue?
When you poll and empty queue it returns null.

What is the time and (extra) space complexity of each of the FixedArrayQueue methods?
Offer: O(1) space O(1), peek: O(1) space O(1), poll: O(n) space O(n) isEmpty: O(1) space O(1)
size: O(1) space O(1), asList O(n) space O(n)