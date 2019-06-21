int search(int[] arr, int left, int right, int key) {
    int med = (left + right) / 2;

    if(arr[med] == key)
        return med;

    if(arr[med] < key)
        return search(arr, med + 1, right, key);

    else
        return search(arr, left, med - 1, key);
}

int binarySearch(int[] arr, int key) {
    return search(arr, 0, arr.length - 1, key);
}
