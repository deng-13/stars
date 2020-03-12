//package com.star.conc.java9.chapter8.recipe12.stream;
//
//import com.star.conc.java9.chapter8.recipe12.data.News;
//
//public class PublisherTask implements Runnable {
//
//	private ConsumerData consumerData;
//	private News news;
//
//	public PublisherTask(ConsumerData consumerData, News news) {
//		this.consumerData = consumerData;
//		this.news = news;
//	}
//
//	@Override
//	public void run() {
//		MySubscription subscription = consumerData.getSubscription();
//		if (!(subscription.isCanceled() && (subscription.getRequested() > 0))) {
//			consumerData.getConsumer().onNext(news);
//			subscription.decreaseRequested();
//		}
//	}
//}
