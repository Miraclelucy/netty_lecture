package com.tenglu.ch00.netty3demo;


import org.jboss.netty.channel.*;

/**
 *  @author lushiqin 20190128
 * 《Netty快速入门教程-第二课 Netty服务端》
 *
 * */
public class HelloHandler extends SimpleChannelHandler{
    @Override
    public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
        String j=(String) e.getMessage();
        System.out.println(j);
        //System.out.println(1/0);
        //回写
        //ctx.getChannel().write("hi");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) throws Exception {

            System.out.println("exceptionCaught"+e.getCause().getMessage());
    }

    @Override
    public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
        System.out.println("channelConnected");
    }

    @Override
    public void channelDisconnected(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
        System.out.println("channelDisconnected");
    }

    @Override
    public void channelClosed(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
        System.out.println("channelClosed");
    }
}
