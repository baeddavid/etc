void merge(int[] arr, int left, int medium, int right) {
    int size1 = medium - left + 1;
    int size2 = right - medium;

    int[] L = new int[size1];
    int[] R = new int[size2];

    for(int i = 0; i < size1; i++)
        L[i] = arr[left + i];
    for(int i = 0; i < size2; i++)
        R[i] = arr[medium + 1 + i];

    int i = 0, j = 0;
    int n = left;

    while(i < size1 && j < size2) {
        if(L[i] <= R[j]) {
            arr[n] = L[i];
            i++;
        } else {
            arr[n] = R[j];
            j++;
        }
        n++;
    }

    while(i < size1)
        arr[n++] = L[i++];

    while(j < size2)
        arr[n++] = R[j++];
}

void sort(int[] arr, int left, int right) {
    if(left < right) {
        int med = (left + right) / 2;
        sort(arr, left, med);
        sort(arr, med + 1, right);

        merge(arr, left, med, right);
    }
}

void mergeSort(int[] arr) {
    sort(arr, 0, arr.length - 1);
}
