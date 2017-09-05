package springtestenhancer.demo.bean;

import javax.annotation.Resource;

/**
 * order facade
 * 
 * @author david
 *
 */
public class OrderFacade {
	@Resource
	OrderDAOService orderDAOService;

	public void save(Order order) {
		orderDAOService.saveToDataBase(order);
	}
}
