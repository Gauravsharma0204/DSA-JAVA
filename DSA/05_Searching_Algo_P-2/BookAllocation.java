public class BookAllocation {
    public static void main(String[] args) {
        int books[] = {12, 34, 67, 90};
        int students = 2;
        System.out.println("Minimum Pages = " + bookAllocation(books, students));
    }

    public static int bookAllocation(int books[], int students) {
        if (books.length < students) {
            return -1;
        }

        int start = 0;
        int end = 0;
        for (int pages : books) {
            start = Math.max(start, pages);
            end += pages;
        }

        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isAllocationPossible(books, mid, students)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }

    static boolean isAllocationPossible(int books[], int maxPages, int students) {
        int currentStudent = 1;
        int pages = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] > maxPages) return false;

            pages += books[i];
            if (pages > maxPages) {
                currentStudent++;
                pages = books[i];
            }
            if (currentStudent > students) {
                return false;
            }
        }
        return true;
    }
}
