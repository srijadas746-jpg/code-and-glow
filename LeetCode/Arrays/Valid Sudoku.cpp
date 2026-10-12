class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {

        bool rows[9][10] = {};
        bool cols[9][10] = {};
        bool boxes[9][10] = {};

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') {
                    continue;
                }

                int num = board[i][j] - '0';

                // Find which 3x3 box this cell belongs to
                int box = (i / 3) * 3 + (j / 3);

                // Duplicate found
                if (rows[i][num] ||
                    cols[j][num] ||
                    boxes[box][num]) {
                    return false;
                }

                // Mark number as present
                rows[i][num] = true;
                cols[j][num] = true;
                boxes[box][num] = true;
            }
        }

        return true;
    }
};