Phaser  可以解决 CyclicBarrier 未解决的问题

  1> phaser.arriveAndAwaitAdvance() -> 当前线程达到屏障，在此等待一段时间，等条件满足后继续向下一个屏障 继续进行
                                    -> 当计数不足时，线程呈现阻塞状态，不继续向下进行
  2> phaser.arriveAndDeregister() -> 使当前线程退出，并将parties 减1
  3> phaser.getPhase() -> 获取的是 已经到达第几个屏障
  4> onAdvance(int phase, int registeredParties ) : 通过新的屏障时被调用
        返回 true -> 不等待了，phaser 呈无效/销毁状态
        返回 false -> 继续正常工作
  5> phaser.register() -> 动态添加一个 parties 的值
  6> phaser.bulkRegister(N) -> 批量增加 parties 的个数 n
  7> phaser.getArrivedParties() ->获取已经被使用的 parties个数
     phaser.getUnarrivedParties() ->获取未被使用的 parties个数
  8> phaser.arrive() -> 使parties 值加1 ，并且不再屏障处等待，直接向下面的代码继续运行，并且 Phaser 类有计数重置功能