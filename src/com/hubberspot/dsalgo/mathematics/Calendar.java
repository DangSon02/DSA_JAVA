package com.hubberspot.dsalgo.mathematics;

/*
 * Viết chương trình nhập vào một năm ( >1582), in lịch của năm đó. Tính thứ cho ngày đầu năm bằng công thức Zeller
 * 
 */

public class Calendar {

    public static void Calendar(int year) {

        int month, dow, date, top, adjustedYear, adjustedMonth;

        // Áp dụng công thức Zeller, tính thứ cho ngày đầu năm (ngày 1/1)

        month = 1;
        adjustedYear = year - (14 - month) / 12;
        adjustedMonth = month + 12 * ((14 - month) / 12) - 2;
        dow = (1 + adjustedYear + adjustedYear / 4 - adjustedYear / 100 + adjustedYear / 400
                + (31 * adjustedMonth) / 12) % 7;

        // lặp cho 12 tháng

        for (month = 1; month <= 12; ++month) {
            System.out.printf("Tháng %d:\n", month);
            System.out.printf(" S  M  T  W  T  F  S\n");

            // Tính số ngày tối đa trong tháng
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    top = 30;
                    break;
                case 2:
                    // Kiểm tra năm nhuận
                    top = 28 + (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? 1 : 0);
                    break;
                default:
                    top = 31;
                    break;
            }

            // In khoảng trống cho các ngày trước tháng
            for (date = 0; date < dow; ++date) {
                System.out.print("   "); // 3 khoảng trắng cho mỗi ngày
            }

            // In các ngày trong tháng
            for (date = 1; date <= top; ++date) {
                System.out.printf("%2d ", date);
                // Xuống dòng sau mỗi tuần
                if ((date + dow) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println(); // Xuống dòng sau mỗi tháng

            // Cập nhật dow cho tháng tiếp theo
            dow = (dow + top) % 7;
        }

    }

    public static void main(String[] args) {

        int year = 2008;

        Calendar(year);

    }
}
