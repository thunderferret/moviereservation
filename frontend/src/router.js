
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ReservationManager from "./components/ReservationManager"

import PaymentManager from "./components/PaymentManager"

import SeatManager from "./components/SeatManager"

import TicketManager from "./components/TicketManager"


import MyPage from "./components/MyPage"
export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/Reservation',
                name: 'ReservationManager',
                component: ReservationManager
            },

            {
                path: '/Payment',
                name: 'PaymentManager',
                component: PaymentManager
            },

            {
                path: '/Seat',
                name: 'SeatManager',
                component: SeatManager
            },

            {
                path: '/Ticket',
                name: 'TicketManager',
                component: TicketManager
            },


            {
                path: '/MyPage',
                name: 'MyPage',
                component: MyPage
            },


    ]
})
