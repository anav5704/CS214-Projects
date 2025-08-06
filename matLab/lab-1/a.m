prices = [2.50, 1.00, 33.90, 7.00, 200.00];

purchases = [
    3 0 0 1 1;
    0 1 1 0 0;
    5 0 0 0 0;
    3 4 2 1 0;
    0 0 0 0 1;
    7 0 3 0 0
];

total_sales = purchases * prices';

disp("Total sales from all customers:");
disp(sum(total_sales)); 
