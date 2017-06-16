package com.wanggang.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wanggang.dao.ProductDao;
import com.wanggang.entity.Product;

/**
 * Servlet implementation class ProductController
 */
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProductController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		;
		request.setCharacterEncoding("UTF-8");
		String act = request.getParameter("act");
		if (act == null || act.trim().equals("")) {
			response.getWriter().write("没有权限访问");
			return;
		}

		/**
		 * 0 查看详情 1添加物品页面显示 2添加物品操作 3删除物品 4编辑物品页面显示
		 */
		if (act.equals("0")) {
			getUserDetail(request, response);
		} else if (act.equals("1")) {
			addProduct(request, response);
		} else if (act.equals("2")) {
			addProductHandle(request, response);
		} else if (act.equals("3")) {
			delProductHandle(request, response);
		} else if (act.equals("4")) {
			editProduct(request, response);
		} else if (act.equals("5")) {
			editProductHandle(request, response);
		}
	}

	private void editProductHandle(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String id = request.getParameter("id");
		String pname = request.getParameter("pname");
		String uid = request.getParameter("uid");

		if (id == null || id.trim().equals("")) {
			return;
		}

		if (pname == null || pname.trim().equals("")) {
			return;
		}

		if (uid == null || uid.trim().equals("")) {
			return;
		}

		int i = ProductDao.editProductById(id, pname);

		if (i > 0) {
			response.sendRedirect("/UserInfo/ProductController?act=0&id=" + uid);
		}
	}

	private void editProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String id = request.getParameter("id");
		if (id == null || id.trim().equals("")) {
			response.getWriter().write("没有找到该物品");
			return;
		}

		Product p = ProductDao.getProductById(id);
		if (p == null) {
			response.getWriter().write("没有找到该物品");
			return;
		}
		request.getSession().setAttribute("p", p);
		response.sendRedirect("/UserInfo/Edit.jsp");
	}

	private void delProductHandle(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String uid = request.getParameter("uid");
		if (id == null || id.trim().equals("")) {
			System.out.println("该物品不存在");
			return;
		}

		if (uid == null || uid.trim().equals("")) {
			System.out.println("该物品所属人不存在,无法删除");
			return;
		}

		ProductDao.delProductById(id);

		try {
			response.sendRedirect("/UserInfo/ProductController?act=0&id=" + uid);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void addProductHandle(HttpServletRequest request, HttpServletResponse response) {
		String uid = request.getParameter("uid");
		String p = request.getParameter("pname");
		System.out.println(p);
		ProductDao.addProductOrderById(uid, p);
		try {
			response.sendRedirect("/UserInfo/ProductController?act=0&id=" + uid);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void addProduct(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.getRequestDispatcher("/AddProduct.jsp").forward(request, response);
	}

	private void getUserDetail(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String id = request.getParameter("id");
		if (id == null || id.trim().equals("")) {
			response.getWriter().write("没有找到该用户");
			return;
		}

		List list = ProductDao.getAllProductsByUserId(id);
		request.setAttribute("list", list);
		request.getRequestDispatcher("/UserDetail.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
