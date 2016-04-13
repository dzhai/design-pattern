# 单例模式

## 定义
保证一个类仅有一个实例，并提供一个访问它的全局访问点

## 实现方式  

### 内部类   

```
public class Singleton {

	private Singleton() {

	}

	private static final class SingletonHelper {
		private static final Singleton instance = new Singleton();
	}

	public static Singleton getInstance() {
		return SingletonHelper.instance;
	}
}
```

### 双重加锁**   

```

public class Singleton2 {

	private static volatile Singleton2 instance = null;

	public Singleton2 getInstance() {
		if (instance == null) {
			synchronized (Singleton2.class) {
				if (instance == null) {
					instance = new Singleton2();
				}
			}
		}
		return instance;
	}
}

```			