package com.tdispatch.passenger.iface.host;

/*
 *********************************************************************************
 *
 * Copyright (C) 2013-2014 T Dispatch Ltd
 *
 * See the LICENSE for terms and conditions of use, modification and distribution
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 *********************************************************************************
 *
 * @author Marcin Orlowski <marcin.orlowski@webnet.pl>
 *
 *********************************************************************************
*/

public interface RedirectorInterface
{
	public void showLogin();
	public void showRegister();
	public void showBooking();
	public void showOAuth();
}
