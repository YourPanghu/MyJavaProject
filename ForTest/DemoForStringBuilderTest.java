package ForTest;

class DemoForStringBuilderTest {
    public static void main(String[] args){
        //定义数组
        String[] data = {"迪丽热巴","古力娜扎","达拉崩吧","萨瓦迪卡"};
        // System.out.println(data);地址值
        //读取数组内容
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        //创建StringBuilder对象
        StringBuilder sb = new StringBuilder();
        //将元素拼接起来
        for(int i=0; i<data.length; i++){
            sb.append(data[i]);
        }
        System.out.println(sb);
    }
}