package filter_test;

import filter.fir;

public class fir_test {

	public static void main(String[] args) {
		
		//Sampled ECG from DSO at 250 samples per second  
		double[] raw={	117,
				122,
				117,
				117,
				117,
				112,
				117,
				112,
				102,
				127,
				127,
				112,
				112,
				183,
				178,
				178,
				137,
				127,
				152,
				142,
				137,
				122,
				147,
				127,
				127,
				132,
				117,
				137,
				117,
				122,
				127,
				122,
				122,
				117,
				122,
				127,
				117,
				107,
				112,
				127,
				117,
				102,
				107,
				117,
				178,
				157,
				132,
				142,
				142,
				127,
				122,
				112,
				147,
				142,
				152,
				178,
				193,
				203,
				198,
				208,
				218,
				183,
				142,
				91,
				81,
				66,
				66,
				81,
				97,
				97,
				102,
				81,
				102,
				117,
				102,
				147,
				127,
				137,
				132,
				137,
				122,
				132,
				147,
				122,
				127,
				127,
				122,
				112,
				122,
				132,
				132,
				132,
				122,
				132,
				132,
				127,
				117,
				127,
				137,
				127,
				127,
				137,
				142,
				137,
				117,
				152,
				193,
				173,
				157,
				147,
				152,
				137,
				142,
				122,
				152,
				147,
				127,
				112,
				127,
				122,
				122,
				102,
				112,
				137,
				122,
				112,
				112,
				112,
				102,
				107,
				117,
				112,
				117,
				117,
				117,
				112,
				163,
				168,
				152,
				142,
				142,
				127,
				132,
				132,
				152,
				132,
				107,
				102,
				142,
				122,
				122,
				122,
				127,
				127,
				112,
				117,
				122,
				132,
				122,
				117,
				132,
				132,
				132,
				142,
				127,
				117,
				107,
				173,
				188,
				157,
				147,
				132,
				142,
				132,
				127,
				112,
				122,
				127,
				142,
				117,
				117,
				127,
				127,
				122,
				112,
				112,
				132,
				122,
				112,
				112,
				127,
				137,
				122,
				122,
				132,
				122,
				122,
				122,
				203,
				168,
				147,
				142,
				152,
				137,
				132,
				127,
				122,
				132,
				142,
				112,
				112,
				132,
				127,
				117,
				112,
				122,
				122,
				117,
				127,
				127,
				132,
				132,
				122,
				127,
				137,
				122,
				112,
				132,
				132,
				152,
				137,
				152,
				163,
				137,
				117,
				137,
				127,
				142,
				122,
				117,
				127,
				122,
				112,
				122,
				132,
				147,
				152,
				193,
				198,
				193,
				208,
				193,
				168,
				132,
				81,
				61,
				71,
				102,
				102,
				112,
				132,
				132,
				142,
				127,
				112,
				132,
				132,
				122,
				112,
				117,
				122,
				102,
				107,
				122,
				122,
				112,
				107,
				107,
				127,
				117,
				117,
				127,
				127,
				122,
				107,
				122,
				132,
				127,
				122,
				117,
				163, 
				198,
				163,
				173,
				163,
				163,
				142,
				147,
				127,
				137
			};
		
		double[] integrator_numerator={0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842,0.0263157894736842};
		//double[] integrator_denominator={1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		fir integrator = new fir(integrator_numerator);
		
		//*
		//double[] filtered_data=integrator.evaluate_array_no_history(raw);
		double[] filtered_data=integrator.evaluate_array(raw);
		
		for(int count=0;count<filtered_data.length;count++)
		{
			System.out.println(filtered_data[count]);
		}
		//*/
	}

}
