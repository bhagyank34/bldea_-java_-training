package com.bldea.crorepathi.package1;

import java.util.Scanner;

public class Questions {
	static String result;
	static String result2;
	static int count_life_line = 3;
	static int aud_phn = 1;
	static int cnt_50_50 = 1;
	static int skip_cnt=1;
	static Scanner sc = new Scanner(System.in);



		public static boolean fetchQuestion1(String name) throws Exception{
		System.out.println("2. Who is the captain of RCB?");
		System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal\n"
				+ "e) help line");
		result = sc.next();
		if (result.equalsIgnoreCase("c")) {
			candidate.setAmount(1000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							candidate.setAmount(1000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										candidate.setAmount(1000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(1000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
						result = sc.next();
						if (result.equalsIgnoreCase("c")) {
							candidate.setAmount(1000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select tsshe life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										candidate.setAmount(1000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(1000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						candidate.setAmount(1000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("b) Maxwell\n" + "c) Faf duplesis\n");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									candidate.setAmount(1000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											candidate.setAmount(1000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											candidate.setAmount(1000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a) Virat\n" + "b) Maxwell\n" + "c) Faf duplesis\n" + "d) Chahal");
				result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					candidate.setAmount(1000);
					return true;
				}
			}

		}


		return false;
	}


public static boolean fetchQuestion2(String name) throws Exception{
	System.out.println("2.data is refers to a? ");
	System.out.println("a) dennis ritchie\n"+
	                   "b) charless babbage\n"+
			           "c)collection of information\n"+
	                    "d)James Gosling\n"+
			           "e) life line");

	result = sc.next();
	if (result.equalsIgnoreCase("c")) {
		candidate.setAmount(5000);
		return true;
	} else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						candidate.setAmount(5000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println( "b) charless babbage\n"+
							           "c)collection of information\n");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(5000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(5000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) dennis ritchie\n"+
							                   "b) charless babbage\n"+
									           "c)collection of information\n"+
							                    "d)James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(5000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(5000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println( "b) charless babbage\n"+
									           "c)collection of information\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(5000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) dennis ritchie\n"+
							                   "b) charless babbage\n"+
									           "c)collection of information\n"+
							                    "d)James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(5000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println( "b) charless babbage\n"+
					           "c)collection of information\n");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						candidate.setAmount(5000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(5000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(5000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) dennis ritchie\n"+
							                   "b) charless babbage\n"+
									           "c)collection of information\n"+
							                    "d)James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(5000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(5000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(5000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) dennis ritchie\n"+
							                   "b) charless babbage\n"+
									           "c)collection of information\n"+
							                    "d)James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(5000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					candidate.setAmount(5000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(5000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println( "b) charless babbage\n"+
									           "c)collection of information\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(5000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) dennis ritchie\n"+
							                   "b) charless babbage\n"+
									           "c)collection of information\n"+
							                    "d)James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(5000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println( "b) charless babbage\n"+
							           "c)collection of information\n");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								candidate.setAmount(5000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(5000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) dennis ritchie\n"+
							                   "b) charless babbage\n"+
									           "c)collection of information\n"+
							                    "d)James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										candidate.setAmount(5000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
		//changes in line 122
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a) dennis ritchie\n"+
	                   "b) charless babbage\n"+
			           "c)collection of information\n"+
	                    "d)James Gosling\n");
			result = sc.next();
			if (result.equalsIgnoreCase("c")) {
				candidate.setAmount(5000);
				return true;
			}
		}

	}


	return false;
}

	public static boolean fetchQuestion3(String name) throws Exception{
		System.out.println("3.who is called founder of computer?");
		System.out.println("a) dennis ritchie\n"+
		                   "b) charless babbage\n"+
				           "c) Rahul Gandhi\n"+
		                    "d) keu thomson\n"+
				           "e) life line\n");

		result = sc.next();
		if (result.equalsIgnoreCase("b")) {
			candidate.setAmount(10000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 0%\n" + "option b = 88%\n" + "option c = 8%\n" + "option d = 5%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							candidate.setAmount(10000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) dennis ritchie\n"+
						                   "b) charless babbage\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										candidate.setAmount(10000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) dennis ritchie\n"+
								                   "b) charless babbage\n"+
										           "c) Rahul Gandhi\n"+
								                    "d) keu thomson\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(10000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) dennis ritchie\n"+
								                   "b) charless babbage\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) dennis ritchie\n"+
								                   "b) charless babbage\n"+
										           "c) Rahul Gandhi\n"+
								                    "d) keu thomson\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) dennis ritchie\n"+
				                   "b) charless babbage\n");
						result = sc.next();
						if (result.equalsIgnoreCase("b")) {
							candidate.setAmount(10000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 88%\n" + "option c = 8%\n" + "option d = 0%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										candidate.setAmount(10000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) dennis ritchie\n"+
								                   "b) charless babbage\n"+
										           "c) Rahul Gandhi\n"+
								                    "d) keu thomson\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(10000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 88%\n" + "option c = 8%\n" + "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) dennis ritchie\n"+
								                   "b) charless babbage\n"+
										           "c) Rahul Gandhi\n"+
								                    "d) keu thomson\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						candidate.setAmount(10000);
						return true;
					} else  {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 88%\n" + "option c = 8%\n" + "option d = 0%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) dennis ritchie\n"+
								                   "b) charless babbage\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) dennis ritchie\n"+
								                   "b) charless babbage\n"+
										           "c) Rahul Gandhi\n"+
								                    "d) keu thomson\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) dennis ritchie\n"+
						                   "b) charless babbage\n");
								result = sc.next();
								if (result.equalsIgnoreCase("b")) {
									candidate.setAmount(10000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 0%\n" + "option b = 88%\n" + "option c = 8%\n" + "option d = 5%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) dennis ritchie\n"+
								                   "b) charless babbage\n"+
										           "c) Rahul Gandhi\n"+
								                    "d) keu thomson\n");
										result = sc.next();
										if (result.equalsIgnoreCase("b")) {
											candidate.setAmount(10000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a) dennis ritchie\n"+
		                   "b) charless babbage\n"+
				           "c) Rahul Gandhi\n"+
		                    "d) keu thomson\n");
				result = sc.next();
				if (result.equalsIgnoreCase("b")) {
					candidate.setAmount(10000);
					return true;
				}
			}

		}


		return false;
	}

	public static boolean fetchQuestion4(String name) throws Exception{
		System.out.println("4.compiler is a?");
		System.out.println("a) software which converts HLL to MLL\n"+
		                   "b) charless babbage\n"+
				           "c)Rahul Gandhi\n"+
		                    "d)James Gosling\n"+
				           "e) life line");

		result = sc.next();
		if (result.equalsIgnoreCase("a")) {
			candidate.setAmount(20000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							candidate.setAmount(20000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) software which converts HLL to MLL\n"+
						                   "b) charless babbage\n");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										candidate.setAmount(20000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										
										System.out.println("a) software which converts HLL to MLL\n"+
										                   "b) charless babbage\n"+
												           "c)Rahul Gandhi\n"+
										                    "d)James Gosling\n");
												           

										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(20000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) software which converts HLL to MLL\n"+
								                   "b) charless babbage\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) software which converts HLL to MLL\n"+
								                   "b) charless babbage\n"+
										           "c)Rahul Gandhi\n"+
								                    "d)James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) software which converts HLL to MLL\n"+
				                   "b) charless babbage\n");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							candidate.setAmount(20000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										candidate.setAmount(20000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) software which converts HLL to MLL\n"+
								                   "b) charless babbage\n"+
										           "c)Rahul Gandhi\n"+
								                    "d)James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(20000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a =88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) software which converts HLL to MLL\n"+
								                   "b) charless babbage\n"+
										           "c)Rahul Gandhi\n"+
								                    "d)James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						candidate.setAmount(20000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) software which converts HLL to MLL\n"+
								                   "b) charless babbage\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) software which converts HLL to MLL\n"+
								                   "b) charless babbage\n"+
										           "c)Rahul Gandhi\n"+
								                    "d)James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) software which converts HLL to MLL\n"+
						                   "b) charless babbage\n");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(20000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(20000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) software which converts HLL to MLL\n"+
								                   "b) charless babbage\n"+
										           "c)Rahul Gandhi\n"+
								                    "d)James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(20000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a) software which converts HLL to MLL\n"+
		                   "b) charless babbage\n"+
				           "c)Rahul Gandhi\n"+
		                    "d)James Gosling\n");
				result = sc.next();
				if (result.equalsIgnoreCase("a")) {
					candidate.setAmount(20000);
					return true;
				}
			}

		}


		return false;
	}

	public static boolean fetchQuestion5(String name) throws Exception {
		System.out.println("5.assembler is a?");
		System.out.println("a) software which converts HLL to MLL\n"+
                "b) charless babbage\n"+
		           "c)Rahul Gandhi\n"+
                 "d)James Gosling\n"+
				           "e) life line");
		result = sc.next();
		if (result.equalsIgnoreCase("a")) {
			candidate.setAmount(40000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 0%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							candidate.setAmount(40000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) software which converts HLL to MLL\n"+
						                "b) charless babbage\n");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(40000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										candidate.setAmount(40000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) software which converts HLL to MLL\n"+
								                "b) charless babbage\n"+
										           "c)Rahul Gandhi\n"+
								                 "d)James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(40000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(40000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) software which converts HLL to MLL\n"+
								                "b) charless babbage\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(40000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) software which converts HLL to MLL\n"+
								                "b) charless babbage\n"+
										           "c)Rahul Gandhi\n"+
								                 "d)James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(40000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) software which converts HLL to MLL\n"+
				                "b) charless babbage\n");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							candidate.setAmount(40000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 0%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(40000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										candidate.setAmount(40000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) software which converts HLL to MLL\n"+
								                "b) charless babbage\n"+
										           "c)Rahul Gandhi\n"+
								                 "d)James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(40000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(40000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(40000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) software which converts HLL to MLL\n"+
								                "b) charless babbage\n"+
										           "c)Rahul Gandhi\n"+
								                 "d)James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(40000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						candidate.setAmount(40000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 0%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(40000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) software which converts HLL to MLL\n"+
								                "b) charless babbage\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(40000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) software which converts HLL to MLL\n"+
								                "b) charless babbage\n"+
										           "c)Rahul Gandhi\n"+
								                 "d)James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(40000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) software which converts HLL to MLL\n"+
						                "b) charless babbage\n");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(40000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(40000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) software which converts HLL to MLL\n"+
								                "b) charless babbage\n"+
										           "c)Rahul Gandhi\n"+
								                 "d)James Gosling\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(40000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a) software which converts HLL to MLL\n"+
		                "b) charless babbage\n"+
				           "c)Rahul Gandhi\n"+
		                 "d)James Gosling\n");
				result = sc.next();
				if (result.equalsIgnoreCase("a")) {
					candidate.setAmount(40000);
					return true;
				}
			}

		}


		return false;
	}

	public static boolean fetchQuestion6(String name) throws Exception{
		System.out.println("6.how many imp conditional statements in java?");
		System.out.println("a) 3 conditional statememts\n"+
		                   "b) 4 conditional statements\n"+
				           "c) 5 conditional statements\n"+
		                    "d) 6 conditional statements\n"+
				           "e) life line");
		result = sc.next();
		if (result.equalsIgnoreCase("a")) {
			candidate.setAmount(50000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							candidate.setAmount(50000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) 3 conditional statememts\n"+
						                   "b) 4 conditional statements\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										candidate.setAmount(2000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) 3 conditional statememts\n"+
										                   "b) 4 conditional statements\n"+
												           "c) 5 conditional statements\n"+
										                    "d) 6 conditional statements\n");
												           
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(2000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) 3 conditional statememts\n"+
								                   "b) 4 conditional statements\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(50000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										
										System.out.println("a) 3 conditional statememts\n"+
										                   "b) 4 conditional statements\n"+
												           "c) 5 conditional statements\n"+
										                    "d) 6 conditional statements\n");
												           
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) 3 conditional statememts\n"+
				                   "b) 4 conditional statements\n");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							candidate.setAmount(50000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										candidate.setAmount(50000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("6.how many imp conditional statements in java?");
										System.out.println("a) 3 conditional statememts\n"+
										                   "b) 4 conditional statements\n"+
												           "c) 5 conditional statements\n"+
										                    "d) 6 conditional statements\n");
												           
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(50000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(50000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
							
										System.out.println("a) 3 conditional statememts\n"+
										                   "b) 4 conditional statements\n"+
												           "c) 5 conditional statements\n"+
										                    "d) 6 conditional statements\n");
												        
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											candidate.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						candidate.setAmount(2000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									candidate.setAmount(50000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) 3 conditional statememts\n"+
								                   "b) 4 conditional statements\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(50000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
					
										System.out.println("a) 3 conditional statememts\n"+
										                   "b) 4 conditional statements\n"+
												           "c) 5 conditional statements\n"+
										                    "d) 6 conditional statements\n");
												        
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) 3 conditional statememts\n"+
						                   "b) 4 conditional statements\n");
								result = sc.next();
								if (result.equalsIgnoreCase("c")) {
									candidate.setAmount(50000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(50000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
					
										System.out.println("a) 3 conditional statememts\n"+
										                   "b) 4 conditional statements\n"+
												           "c) 5 conditional statements\n"+
										                    "d) 6 conditional statements\n");
												      
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(50000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a) 3 conditional statememts\n"+
				                   "b) 4 conditional statements\n"+
						           "c) 5 conditional statements\n"+
				                    "d) 6 conditional statements\n");
						           
				result = sc.next();
				if (result.equalsIgnoreCase("a")) {
					candidate.setAmount(50000);
					return true;
				}
			}

		}


		return false;
	}


	public static boolean fetchQuestion7(String name) throws Exception {
		System.out.println("7.variables are defined as?");
		System.out.println("a) memory location\n"+
		                   "b) RAM location\n"+
		                   "c)ROM location\n"+ 
		                   "d) any one\n"+
		                   "e) life line");	
		
		result = sc.next();
		if (result.equalsIgnoreCase("a")) {
			candidate.setAmount(60000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 0%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							candidate.setAmount(60000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) memory location\n"+
						                   "b) RAM location\n");
	
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(60000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										candidate.setAmount(60000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										
										System.out.println("a) memory location\n"+
										                   "b) RAM location\n"+
										                   "c)ROM location\n"+ 
										                   "d) any one\n");
										                   
												
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(60000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(60000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) memory location\n"+
								                   "b) RAM location\n");
			
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(60000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) memory location\n"+
								                   "b) RAM location\n"+
								                   "c)ROM location\n"+ 
								                   "d) any one\n");

										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(60000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) memory location\n"+
				                   "b) RAM location\n");

						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							candidate.setAmount(70000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 0%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(70000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										candidate.setAmount(70000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) memory location\n"+
								                   "b) RAM location\n"+
								                   "c)ROM location\n"+ 
								                   "d) any one\n");

										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(60000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(60000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(60000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) memory location\n"+
								                   "b) RAM location\n"+
								                   "c)ROM location\n"+ 
								                   "d) any one\n");

										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(60000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						candidate.setAmount(60000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 0%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(60000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) memory location\n"+
								                   "b) RAM location\n");
			
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(60000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) memory location\n"+
								                   "b) RAM location\n"+
								                   "c)ROM location\n"+ 
								                   "d) any one\n");

										
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(60000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) memory location\n"+
						                   "b) RAM location\n");
	
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(60000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 0%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(60000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) memory location\n"+
								                   "b) RAM location\n"+
								                   "c)ROM location\n"+ 
								                   "d) any one\n");

										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(60000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a) memory location\n"+
		                   "b) RAM location\n"+
		                   "c)ROM location\n"+ 
		                   "d) any one\n");
		                   

				
				result = sc.next();
				if (result.equalsIgnoreCase("a")) {
					candidate.setAmount(60000);
					return true;
				}
			}

		}


		return false;
	}

	public static boolean fetchQuestion8(String name) throws Exception{
		System.out.println("8.array is a ?");
		System.out.println("a) collection of characters\n"+
                "b) 4 conditional statements\n"+
		           "c) 5 conditional statements\n"+
                 "d) 6 conditional statements\n"+
		           "e) life line");
		
		result = sc.next();
		if (result.equalsIgnoreCase("a")) {
			candidate.setAmount(70000);
			return true;
		} else if (result.equalsIgnoreCase("e")) {
			if (count_life_line > 0) {
				count_life_line--;
				System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
				System.out.println("Select the life line:");
				String result2 = sc.next();
				if (result2.equalsIgnoreCase("a")) {
					if (aud_phn != 0) {
						aud_phn = 0;
						Thread.sleep(10000);
						System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
						System.out.println("Select the option");
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							candidate.setAmount(70000);
							return true;
						} else {
							return false;
						}
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
								+ "b. 50-50\n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) collection of characters\n"+
						                "b) 4 conditional statements\n");
								
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(70000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										candidate.setAmount(70000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("a) collection of characters\n"+
								                "b) 4 conditional statements\n"+
										           "c) 5 conditional statements\n"+
								                 "d) 6 conditional statements\n");
										           
										
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(70000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(70000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
										+ "b. 50-50 \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) collection of characters\n"+
								                "b) 4 conditional statements\n");
										
								               result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(70000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("8.array is a ?");
										System.out.println("a) collection of characters\n"+
								                "b) 4 conditional statements\n"+
										           "c) 5 conditional statements\n"+
								                 "d) 6 conditional statements\n");
										           
										
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(70000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
				else if (result2.equalsIgnoreCase("b")) {
					if (cnt_50_50 != 0) {
						cnt_50_50 = 0;
						System.out.println("Select the options");
						System.out.println("a) collection of characters\n"+
				                "b) 4 conditional statements\n");						
						result = sc.next();
						if (result.equalsIgnoreCase("a")) {
							candidate.setAmount(70000);
							return true;
						} else {
							return false;
						}

					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50 -- (not available) \n" + "c. skip");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(2000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50 -- (not available) \n" + "c. skip");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("c")) {
									if(skip_cnt!=0) {
										candidate.setAmount(70000);
										return true;
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										
										System.out.println("a) collection of characters\n"+
								                "b) 4 conditional statements\n"+
										           "c) 5 conditional statements\n"+
								                 "d) 6 conditional statements\n");
										           
										
										
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											candidate.setAmount(70000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("c")) {
							if (skip_cnt != 0) {
								skip_cnt = 0;
								candidate.setAmount(70000);
								return true;
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("c")) {
											candidate.setAmount(70000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
				
										System.out.println("a) collection of characters\n"+
								                "b) 4 conditional statements\n"+
										           "c) 5 conditional statements\n"+
								                 "d) 6 conditional statements\n");
										           
										
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(70000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}

				else if (result2.equalsIgnoreCase("c")) {
					if (skip_cnt != 0) {
						skip_cnt = 0;
						candidate.setAmount(70000);
						return true;
					} else {
						//
						System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
								+ "b. 50-50  \n" + "c. skip -- (not available)");
						System.out.println("Select the life line:");
						String result3 = sc.next();
						if (result3.equalsIgnoreCase("a")) {
							if (aud_phn != 0) {
								aud_phn = 0;
								Thread.sleep(10000);
								System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
								System.out.println("Select the option");
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(70000);
									return true;
								} else {
									return false;
								}
							}
							else {
								System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
										+ "b. 50-50  \n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4 = sc.next();
								if(result4.equalsIgnoreCase("b")) {
									if (cnt_50_50 != 0) {
										cnt_50_50 = 0;
										System.out.println("Select the options");
										System.out.println("a) collection of characters\n"+
								                "b) 4 conditional statements\n");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(70000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										System.out.println("8.array is a ?");
										System.out.println("a) collection of characters\n"+
								                "b) 4 conditional statements\n"+
										           "c) 5 conditional statements\n"+
								                 "d) 6 conditional statements\n");
										           
										
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(70000);
											return true;
										}
										else
											return false;
									}
								}
								//--- need code intervention
							}
						} else if (result2.equalsIgnoreCase("b")) {
							if (cnt_50_50 != 0) {
								cnt_50_50 = 0;
								System.out.println("Select the options");
								System.out.println("a) collection of characters\n"+
						                "b) 4 conditional statements\n");
								
								result = sc.next();
								if (result.equalsIgnoreCase("a")) {
									candidate.setAmount(70000);
									return true;
								} else {
									return false;
								}
							}
							else {
								//
								System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
										+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
								System.out.println("Select the life line:");
								String result4= sc.next();
								if (result3.equalsIgnoreCase("b")) {
									if (aud_phn != 0) {
										aud_phn = 0;
										Thread.sleep(10000);
										System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
										System.out.println("Select the option");
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(70000);
											return true;
										} else {
											return false;
										}
									}
									else {
										System.out.println("You have no life line left. Please select an option:");
										
										System.out.println("a) collection of characters\n"+
								                "b) 4 conditional statements\n"+
										           "c) 5 conditional statements\n"+
								                 "d) 6 conditional statements\n");
										           
										
										result = sc.next();
										if (result.equalsIgnoreCase("a")) {
											candidate.setAmount(70000);
											return true;
										}
										else
											return false;
									}
								}
							}
						}
					}
				}
			}
			//changes in line 122
			else {
				System.out.println("You have no life line left. Please select an option:");
				System.out.println("a) collection of characters\n"+
		                "b) 4 conditional statements\n"+
				           "c) 5 conditional statements\n"+
		                 "d) 6 conditional statements\n");
				result = sc.next();
				if (result.equalsIgnoreCase("c")) {
					candidate.setAmount(70000);
					return true;
				}
			}

		}


		return false;
	}
	 static boolean fetchQuestion9(String name) throws Exception{
	System.out.println("9. inheritance is refere to as?");
	System.out.println("a) collection of characters\n"+
            "b) hirerchy of classes\n"+
	           "c) 5 conditional statements\n"+
             "d) 6 conditional statements\n"+
			           "e) life line");

	result = sc.next();
	if (result.equalsIgnoreCase("b")) {
		candidate.setAmount(80000);
		return true;
	} else if (result.equalsIgnoreCase("e")) {
		if (count_life_line > 0) {
			count_life_line--;
			System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
			System.out.println("Select the life line:");
			String result2 = sc.next();
			if (result2.equalsIgnoreCase("a")) {
				if (aud_phn != 0) {
					aud_phn = 0;
					Thread.sleep(10000);
					System.out.println("option a = 0%\n" + "option b = 88%\n" + "option c = 5%\n" + "option d = 7%");
					System.out.println("Select the option");
					result = sc.next();
					if (result.equalsIgnoreCase("b")) {
						candidate.setAmount(80000);
						return true;
					} else {
						return false;
					}
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
							+ "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) collection of characters\n"+
						            "b) hirerchy of classes\n");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								candidate.setAmount(80000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(80000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) collection of characters\n"+
								            "b) hirerchy of classes\n"+
									           "c) 5 conditional statements\n"+
								             "d) 6 conditional statements\n");
											           
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(80000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(80000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
									+ "b. 50-50 \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) collection of characters\n"+
								            "b) hirerchy of classes\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(80000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) collection of characters\n"+
								            "b) hirerchy of classes\n"+
									           "c) 5 conditional statements\n"+
								             "d) 6 conditional statements\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(80000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
			else if (result2.equalsIgnoreCase("b")) {
				if (cnt_50_50 != 0) {
					cnt_50_50 = 0;
					System.out.println("Select the options");
					System.out.println("a) collection of characters\n"+
				            "b) hirerchy of classes\n");
					result = sc.next();
					if (result.equalsIgnoreCase("b")) {
						candidate.setAmount(80000);
						return true;
					} else {
						return false;
					}

				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50 -- (not available) \n" + "c. skip");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 88%\n" + "option c = 5%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								candidate.setAmount(80000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("c")) {
								if(skip_cnt!=0) {
									candidate.setAmount(80000);
									return true;
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) collection of characters\n"+
								            "b) hirerchy of classes\n"+
									           "c) 5 conditional statements\n"+
								             "d) 6 conditional statements\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(80000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(80000);
							return true;
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 88%\n" + "option c = 5%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(80000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) collection of characters\n"+
								            "b) hirerchy of classes\n"+
									           "c) 5 conditional statements\n"+
								             "d) 6 conditional statements\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(80000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}

			else if (result2.equalsIgnoreCase("c")) {
				if (skip_cnt != 0) {
					skip_cnt = 0;
					candidate.setAmount(80000);
					return true;
				} else {
					//
					System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
							+ "b. 50-50  \n" + "c. skip -- (not available)");
					System.out.println("Select the life line:");
					String result3 = sc.next();
					if (result3.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 88%\n" + "option c = 5%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								candidate.setAmount(80000);
								return true;
							} else {
								return false;
							}
						}
						else {
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if(result4.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) collection of characters\n"+
								            "b) hirerchy of classes\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(80000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) collection of characters\n"+
								            "b) hirerchy of classes\n"+
									           "c) 5 conditional statements\n"+
								             "d) 6 conditional statements\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(80000);
										return true;
									}
									else
										return false;
								}
							}
							//--- need code intervention
						}
					} else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) collection of characters\n"+
						            "b) hirerchy of classes\n");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								candidate.setAmount(80000);
								return true;
							} else {
								return false;
							}
						}
						else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
									+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result4 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 88%\n" + "option c = 5%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(80000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("You have no life line left. Please select an option:");
									System.out.println("a) collection of characters\n"+
								            "b) hirerchy of classes\n"+
									           "c) 5 conditional statements\n"+
								             "d) 6 conditional statements\n");
											           
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										candidate.setAmount(80000);
										return true;
									}
									else
										return false;
								}
							}
						}
					}
				}
			}
		}
	
		else {
			System.out.println("You have no life line left. Please select an option:");
			System.out.println("a) collection of characters\n"+
		            "b) hirerchy of classes\n"+
			           "c) 5 conditional statements\n"+
		             "d) 6 conditional statements\n");
					           
			result = sc.next();
			if (result.equalsIgnoreCase("b")) {
				candidate.setAmount(80000);
				return true;
			}
		}

	}


	return false;
}
	 public static boolean fetchQuestion10(String name) throws Exception{
		 System.out.println("10.who is the founder of whatsapp?");
			System.out.println("a) jan koum,brian acton\n"+
			                   "b) charless babbage\n"+
					           "c)Rahul Gandhi\n"+
			                    "d)James Gosling\n"+
					           "e) life line");
			result = sc.next();
			if (result.equalsIgnoreCase("a")) {
				candidate.setAmount(2000);
				return true;
			} else if (result.equalsIgnoreCase("e")) {
				if (count_life_line > 0) {
					count_life_line--;
					System.out.println("Available Life line:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result2 = sc.next();
					if (result2.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								candidate.setAmount(100000);
								return true;
							} else {
								return false;
							}
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50\n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) jan koum,brian acton\n"+
							                   "b) charless babbage\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(100000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											candidate.setAmount(100000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) jan koum,brian acton\n"+
									                   "b) charless babbage\n"+
											           "c)Rahul Gandhi\n"+
									                    "d)James gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												candidate.setAmount(100000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									candidate.setAmount(100000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
											+ "b. 50-50 \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("a) jan koum,brian acton\n"+
									                   "b) charless babbage\n");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												candidate.setAmount(100000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) jan koum,brian acton\n"+
									                   "b) charless babbage\n"+
											           "c)Rahul Gandhi\n"+
									                    "d)James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												candidate.setAmount(100000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
					else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) jan koum,brian acton\n"+
					                   "b) charless babbage\n");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								candidate.setAmount(100000);
								return true;
							} else {
								return false;
							}

						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(100000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											candidate.setAmount(100000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) jan koum,brian acton\n"+
									                   "b) charless babbage\n"+
											           "c)Rahul Gandhi\n"+
									                    "d)James Gosling\n");
									
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												candidate.setAmount(100000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									candidate.setAmount(100000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												candidate.setAmount(100000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) jan koum,brian acton\n"+
									                   "b) charless babbage\n"+
											           "c)Rahul Gandhi\n"+
									                    "d)James Gosling\n");
									
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												candidate.setAmount(100000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}

					else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							candidate.setAmount(100000);
							return true;
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(100000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50  \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									
							
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("a) jan koum,brian acton\n"+
									                   "b) charless babbage\n");
									
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												candidate.setAmount(100000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) jan koum,brian acton\n"+
									                   "b) charless babbage\n"+
											           "c)Rahul Gandhi\n"+
									                    "d)James Gosling\n");
									
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												candidate.setAmount(100000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) jan koum,brian acton\n"+
							                   "b) charless babbage\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										candidate.setAmount(100000);
										return true;
									} else {
										return false;
									}
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 88%\n" + "option b = 5%\n" + "option c = 0%\n" + "option d = 7%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												candidate.setAmount(100000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) jan koum,brian acton\n"+
									                   "b) charless babbage\n"+
											           "c)Rahul Gandhi\n"+
									                    "d)James Gosling\n");
							                         result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												candidate.setAmount(100000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
				}
				else {
					System.out.println("You have no life line left. Please select an option:");
					System.out.println("a) jan koum,brian acton\n"+
			                   "b) charless babbage\n"+
					           "c)Rahul Gandhi\n"+
			                    "d)James Gosling\n");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						candidate.setAmount(100000);
						return true;
					}
				}

			}
return false;
		}
}
	
