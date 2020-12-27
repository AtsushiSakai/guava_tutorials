import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class TableSample {

    public static void main(String[] args) {
        Table<Integer, Integer, Double> gridMap = HashBasedTable.create();

        // データの追加
        gridMap.put(1, 1,2.0);
        gridMap.put(1, 2,3.0);
        System.out.println(gridMap);// {1={1=2.0, 2=3.0}}

        // データの変更
        gridMap.put(1, 1,5.0);
        System.out.println(gridMap);// {1={1=5.0, 2=3.0}}

        // データ取得
        System.out.println(gridMap.get(1, 1)); // 5.0

        // 行と列の取得
        gridMap.put(2, 1,4.0);
        System.out.println(gridMap.row(2)); // {1=4.0}
        System.out.println(gridMap.column(1)); // {1=5.0, 2=4.0}

        for(Table.Cell<Integer, Integer, Double> cell : gridMap.cellSet()) {
            System.out.println(cell.getRowKey() + "," + cell.getColumnKey() + "," + cell.getValue());
//            1,1,5.0
//            1,2,3.0
//            2,1,4.0
        }
    }
}
