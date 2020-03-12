Future 和 Callable
  Callable接口的 call() 方法可以有返回值，而Runnable 接口的 run() 方法没有返回值
  Callable接口的 call() 方法可以声明抛出异常，而Runnable 接口的 run() 方法 不可以声明抛出异常

  submit() 参数传入 runnable 无返回值，方法 future.get() 有阻塞特性，future.isDone() 无阻塞特性
  cancel(boolean mayInterruptIfRunning) -> 如果线程正在运行，则是否中断正在运行的线程，需要和if (Thread.currentThread().isInterrupted()) 配合使用

  execute() 和 submit()的区别：
    1> execute() 没有返回值，submit() 可以有返回值
    2> execute() 默认情况下直接抛出异常不能捕获，但可以通过ThreadFactory 的方式捕获；submit() 默认情况下 可以捕获异常
  Future 的缺点：
    Future 的实现类是 FutureTask，在使用线程池时，默认的情况下也是 FutureTask。
    Callable 可以通过 Future 获取返回值，但是 future.get() 有阻塞特性 ，
      即调用get() 方法时，任务尚未完成，则一直阻塞到此任务完成为止。影响效率。




