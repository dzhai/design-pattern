### 单例模式
1. **定义**  
保证一个类仅有一个实例，并提供一个访问它的全局访问点
2. **实现方式**  
懒汉式  
饿汉式  
双重加锁  
内部类  
枚举    
```
public class Singleton {
	
		private static class SingletonHelper {
			private static Singleton s = new Singleton();
		}
	
		public static Singleton4 getInstance() {
			return SingletonHelper.s;
		}
}
```
### Link
- [源码地址](https://github.com/dzhai/Demo/tree/master/Designpattern/src/com/d/singleton)
- [参考](http://blog.csdn.net/m13666368773/article/details/7679343)
