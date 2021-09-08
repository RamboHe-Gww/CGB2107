package cn.tedu.basic;
/**本类用于进一步测试变量的使用*/
public class TestVariable2 {
	/**2、成员变量
	 * 1》位置：类里方法外
	 * 2》使用范围：在整个数中都有生效，类消失，变量才会释放
	 * 3》注意事项：无需手动初始化，会自动赋予对应类型的默认值
	 * */
	static int sum = 200;
	static int count;
	
	public static void main(String[] args){
		System.out.println(count);
		System.out.println(sum);
		/**1、局部变量
		 * 1》位置：在方法里/局部代码块中
		 * 2》未用范围：在哪里定义就在哪里使用
		 * 当对应的方法/局部代码块结束后，对应的局部变量也会被释放
		 *3》 注意事项：局部变量必须手动初始化--赋值*/
		int sum = 100;
		System.out.println(sum);/**变量有就近原则*/
		
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
//		System.out.println(i);
		//会报错，因为局部变量i只能在for循环代码块使用
	}
}
