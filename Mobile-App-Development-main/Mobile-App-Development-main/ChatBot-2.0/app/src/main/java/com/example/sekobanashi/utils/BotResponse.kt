package com.example.sekobanashi.utils


import android.app.SearchManager
import android.content.Context
import android.content.Intent
import androidx.core.graphics.toColorInt
//import androidx.core.content.ContextCompat.startActivity
//import androidx.recyclerview.widget.RecyclerView
import com.example.sekobanashi.utils.Constants.OPEN_GALLERY
import com.example.sekobanashi.utils.Constants.OPEN_GOOGLE
import com.example.sekobanashi.utils.Constants.OPEN_SEARCH
import java.sql.Date
import java.sql.Timestamp
import java.text.FieldPosition
import java.text.SimpleDateFormat


object BotResponse {

    fun basicResponses(_message: String): String {
//        val intent = Intent(Intent.ACTION_WEB_SEARCH)
//        var GOOGLE_SERACH_URL = "https://www.google.com/search?q="
        val help="""help""".toRegex()
        val about="""about""".toRegex()
        val address="""address""".toRegex()
        val contact="""contact""".toRegex()
        val course="""course|courses""".toRegex()
        val ug="""ug""".toRegex()
        val fees="""fees|fee""".toRegex()
        val library="""library""".toRegex()
        val training="""training""".toRegex()
        val hostel="""hostel""".toRegex()
        val sports="""sports""".toRegex()
        val transport="""transport""".toRegex()
        val yes="""yes""".toRegex()
        val civil="""civil""".toRegex()
        val computer="""computer|cs""".toRegex()
        val ise="""information science|ise""".toRegex()
        val mech="""mechanical|mech""".toRegex()
        val ele="""electronics""".toRegex()
        val random = (0..2).random()
        val message =_message.toLowerCase()
        val darshan="darshan".toRegex()



        return when {
            yes.containsMatchIn(input=message)->
            {
                "Welcome Aboard!! Lets Start This Fantastic Journey You can press the (help) to check out the answers to various queries\n"+
                "Lets Begin!"
            }
            help.containsMatchIn(input = message)->
            {
                "->About\n"+ "->Address\n"+"->Contact\n"+"->Courses\n"+"->UG\n"+"->Fees\n"+"->library\n"+"->training\n"+"->hostel\n"+"->sports\n"+"->transport\n"
            }

            about.containsMatchIn(input=message)->{
                "JSS Academy of Technical Education (JSSATE) was established in the year 1997 at Bangalore and is under the umbrella of JSS Mahavidyapeetha, Mysore. JSSATE is the result of the vision of our President, His Holiness Jagadguru Sri Shivarathri Deshikendra Mahaswamiji to proactively participate in establishing a world class Institution for Technical Education. The Campus is located on a sprawling 21.17 acres land surrounded by lush green plantation on the South-Western edge of Bangalore City. The institution is affiliated to Visvesvaraya Technological University (VTU), Belagavi, India. \n"+ "You can press the (help) to check out the answers to various  other queries\n"+
                "Lets Begin!"
            }
            address.containsMatchIn(input=message)->{
                "JSS Academy of Technical Education\n" +
                        "\n" +
                        "JSSATE-B Campus,\n" +
                        "\n" +
                        "Dr.Vishnuvardhan Road,\n" +
                        "\n" +
                        "Uttarahalli - Kengeri Main Road,\n" +
                        "\n" +
                        "Srinivaspura-Post, Bengaluru – 560 060,\n" +
                        "\n" +
                        "Karnataka, India\n"+"You can press the (help) to check out the answers to various  other queries\n"+
                "Lets Begin! \n"
            }
            contact.containsMatchIn(input=message)->
            {
                "Ph: 080 - 2861 2565 / 2861 1702\n" +
                        "Fax: 080 - 2861 2706 / 2861 2646\n"+
                "Admission Coordinator:\n"+
                "Contact & email: +91 6364771945; +91 9916253458, admissions@jssateb.ac.in\n"+
                "Vice Principal:\n"+
                "Contact & email:+91 9448234414; principal@jssateb.ac.in\n"+
                "Administrative Officer:\n"+
                "Contact & email: +91 9900928583; jssateao@gmail.com\n"+
                "URL: www.jssateb.ac.in\n"+"You can press the (help) to check out the answers to various  other queries\n"+
                "Lets Begin! \n"

            }
            course.containsMatchIn(input=message)->{
                "UNDER GRADUATE PROGRAMS\n" +
                        "POST GRADUATE PROGRAMS\n" +
                        "RESEARCH PROGRAMS\n"
            }
            ug.containsMatchIn(input = message)->
            {
                "Under Graduate Programs Offered\n"+
                        "-> Civil Engineering\n" +
                        "-> Mechanical Engineering\n" +
                        "-> Information Science & Engineering\n" +
                        "-> Computer Science & Engineering\n" +
                       // "Electronics & Instrumentation Engineering\n" +
                        "-> Electronics & Communication Engineering\n"
                        //"Artificial Intelligence and Machine Learning\n" +
                       // "Robotics and Automation\n"
            }
            fees.containsMatchIn(input = message)->
            {
                "A. KEA - CET:\n" +
                        "•\tTuition fee: As per the Govt. of Karnataka orders.\n" +
                        "•\tCollege fees, VTU Fees & Multi skill training fees: As per the Govt. of Karnataka orders.\n" +
                        "•\tTransportation Fee (Optional): Rs. 20,000/-\n" +
                        "B. COMEDK:\n" +
                        "*- Includes Tuition,College and VTU Fees.\n" +
                        "In addition to above fees paid following is applicable:\n" +
                        "•\tEligibility Fees for Non-Karnataka students is Rs. 2,500/-\n" +
                        "•\tEligibility Fees for NRI students is Rs.12,500/- (one time)\n" +
                        "•\tTransportation Fee (Optional): Rs. 20,000/-\n" +
                        "C. MANAGEMENT:\n" +
                        "*- Includes Tuition,College and VTU Fees.\n" +
                        "In addition to above tuition fee for Management seats the following is applicable:\n" +
                        "•\tCollege & VTU Fees : Rs. 42490/-\n" +
                        "•\tEligibility Fees for Non Karnataka students is Rs. 2,500/-\n" +
                        "•\tEligibility Fees for NRI students is Rs.12500/-, one time\n" +
                        "Q)  Fee Structure for Lateral Entry Admissions (KEA - CET)::\n" +
                        "•\tTution fee Rs. 58806/-\n" +
                        "•\tCollege & VTU Fees: Rs. 45,690/- for CSE and ISE\n" +
                        "•\tCollege & VTU Fees: Rs. 45,840/- for ECE and EIE\n" +
                        "•\tCollege & VTU Fees: Rs. 45,340/- for ME, CIVIL and IEM\n" +
                        "•\tEligibility Fees for Non-Karnataka students is Rs. 2,500/-\n" +
                        "•\tEligibility Fees for NRI students is Rs.12,500/-, one time\n" +
                        "Q) Account Details:\n" +
                        "JSS Academy Of Technical Education, Bengaluru\n" +
                        "ACCOUNT NO: 520101062304263\n" +
                        "Union bank of India, Bangalore 560011,\n" +
                        "Jaya Nagar Branch: 00745\n" +
                        "IFSC Code: UBIN0900745\n"+"You can press the (help) to check out the answers to various  other queries\n"+
                "Lets Begin! \n"
            }
            library.containsMatchIn(input = message)->
            {
               " •	Library with 2018.18 Sq.mts area\n"+
                "•	Lending & News Paper sections open from 9.00AM -4.00PM, Reference Section is open from 9AM - 9PM and during exam -till 9. \n"+
                "•	Library is automated using LIBSOFT software with access through web, having own library portal ( http://Libserver/OPAC)\n"+
                "•	Have Reprographic and Photostat facility\n"+
                "•	Each student can borrow 3 books from lending section and use for 15 days.\n"
               " •	Having General Book Bank & each student can borrow 4 books and use for entire semester.\n"+
                       "You can press the (help) to check out the answers to various  other queries\n"+
                "Lets Begin!\n"

            }
            training.containsMatchIn(input=message)->
            {
                "The T & P cell organizes the following activities for students –\n"+
                "•  Aptitude Related Analytical Skills for enhancing analytical skills of students.\n"+
                "•  Soft skills are a quite essential qualification for professionals aspiring to move up the value chain especially attitude, communication and presentation.\n"+
                "•  Group Discussions are organized to promote skills of interaction in group and leadership styles. The company executives/ employers will be invited to share their valued expertise on various topics, workplace situations with our students, current trends and future scenario.\n"+
                "•  Mock Interview rounds will be conducted to build confidence and self esteem in students to perform with ease in front of panel members during campus placements\n"+
                "•  Company Specific training programs will be conducted for all final year students on Aptitude related analytical skills, Group Discussion and Interview skills by Industry veterans just before the visit of MNCs.\n"+
                "•  Eminent management personalities are invited to conduct workshops on Personality Development, Interpersonal and Communication Skills, Time management, Memory Management etc.\n"+
                "•  Participation of students in activities that provide them all round personal and professional growth will be promoted."+
                        "You can press the (help) to check out the answers to various  other queries\n"+
                "Lets Begin!\n"


            }
            hostel.containsMatchIn(input=message)->{
              "  •	Well-furnished Boys hostel in the campus: Total capacity - 453\n"+
               " o	Single Occupancy with attached bathroom & toilet facility - 15 Nos.\n"+
               " o	Three sharing with general bathroom & toilet facility - 146 Nos.\n"+
               " Well-furnished Girls hostel within the campus: Total capacity - 315\n"+
               " o	Single Occupancy with attached bathroom & toilet facility - 06 Nos.\n"+
               " o	Three sharing with attached bathrooms & toilet facility - 109 Nos.\n"+
               " •	Spacious dining hall, TV room, Gym, internet facility, Sports facilities (Table tennis, Badminton, Through ball, Football, Cricket) and round the clock security.\n"+
               " •	Guest rooms for parents and guardians on payment basis subject to the availability.\n"+
               " •	In the beginning of semester, students committee will be formed. The committee will discuss and decide about the menu for breakfast, lunch and dinner for all the days.\n"+"You can press the (help) to check out the answers to various  other queries\n"+
                "Lets Begin!\n"

            }
            sports.containsMatchIn(input=message)->
            {
                "JSS Academy of Technical Education, Bengaluru has been giving equal importance to both Curricular, Co-curricular and extracurricular activities. To encourage the students to participate in sports activities, the institute has created all the necessary sports facilities.\n"+
                "Department of Physical Education and sports was started in the year 1997 aims at all round development of the students’ personality through sports activities. Our college Sports department has been organizing many sports events such as VTU Inter collegiate, Bengaluru South Zone Cricket Tournaments, Inter-zone sports events.\n"+
                "Karnataka State Cricket Association (KSCA), Bangalore has recognized our college cricket ground as one of the best turf cricket grounds in Karnataka. Our college sports department has been conducting series of cricket matches which include Division matches, Women’s’ Matches, Zonal Matches for Under 14, 16, 19, etc. throughout the year in association with KSCA."+"You can press the (help) to check out the answers to various  other queries\n"+
                "Lets Begin!\n"

            }
            transport.containsMatchIn(input = message)->
            {
                "JSS Academy of Technical Education is situated in serene location at about 12 KM from main city center. It takes about an hour to reach the college in normal traffic condition.\n"+
                "At present, the institute is operating buses in three routes to provide transportation services for both students and staff from different parts of the city. Buses are hired on annual contract basis from M/s. Sathyasai Tourists. The institute is located on Banashakari - Kengeri main road. Plenty of BMTC buses are plying via college to important places like Banashankari, Konanakunte Metro station, Electronics City, Kengeri, Majestic, Jayanagar, etc. Some of the major BMTC transit lines have routes that pass near our college are 375 (from Banashankari to Kengeri), 375D (from Banashankari to Kengeri), 378 (from Electronics city to Kengeri)."


            }
            civil.containsMatchIn(input=message)->
            {
                "The Department of Civil Engineering was established in the year 2009, with the vision to produce responsible, technically qualified professionals with ethical and human values by providing excellent teaching learning and research. The department is accredited to National Board of Accreditation (NBA) with a current intake of 60.\n" +
                        "\n" +
                        "The department has to its credit a team of qualified, experienced and dedicated faculty members. At present department have 8 faculty members with PhD degree and remaining faculty members in the department are carrying out their research work. The main aim of the department is to equip the students with the knowledge and expertise to grow professionally and contribute significantly to the society.\n" +
                        "\n" +
                        "Department has established membership with professional bodies, such as Indian Concrete Institute (ICI) Bangalore center, Association of Consulting Civil Engineering (ACCE (I)) Bangalore Center and Builders Association of India (BAI) Bangalore Centre.\n" +
                        "\n" +
                        "The Department of Civil Engineering has established a good relationship with core Civil Engineering Industries. Department is coordinating with more than 25 companies which are offering internship and placement opportunities to the students. The department regularly organizes Webinars, Student development programs, Faculty development programs, Conferences, seminars and Workshops for the betterment of the students and Civil Engineering fraternity.\n"+
                        "Vision\n" +
                        "To produce responsible, technically qualified professionals with ethical and human values by providing excellent teaching-learning and research.\n" +
                        "\n" +
                        "Mission\n" +
                        "Impart fundamental technical knowledge through learner-centric teaching methodology.\n" +
                        "Empower student and faculty by involving in co-scholastic and research activities.\n" +
                        "Equip students to face socio-technical challenges with ethical and human values."

            }
            computer.containsMatchIn(input=message)->
            {
                "The Department of Computer Science and Engineering was established in the year 1997, with the objective of imparting quality education in the field of Computer Science and Engineering. The Program is accredited by NBA with current intake of 180 Students. The department has to its credit a team of qualified, experienced and dedicated faculty, whose main aim is to equip students with the knowledge and expertise to grow professionally and contribute significantly to the society.\n" +
                        "\n" +
                        "The Department is recognized as a research centre by Visvesvaraya Technological University, Belagavi. Faculty members are actively involved in publishing research paper in various National /International Journals and Conferences. The Department regularly organizes Student development programs, Faculty development programs, Conferences, and Workshops. A continuous interaction with industries is established through MOUs, Industry visits, and Internships. Department has a membership with professional bodies and conducts various technical activities. The Department has a technical forum called INiT (Innovation in Technology), student clubs NCrypt and Split_Train_Test which is responsible for research and development of innovative ideas.\n" +
                        "\n" +
                        "Students are consistently getting ranks in University exams. They are encouraged to participate in various co-curricular and extra-curricular activities and have won prizes. Training and Placement division provides full training and placement assistance to students in all areas of professional education. Around 90% of our students get placed in reputed companies. Students have exhibited good performance in competitive examinations. Alumnus are serving in various positions in reputed companies like Amazon, Adobe, Accenture, Wipro Technologies and Cognizant Technologies. With the rapidly evolving technology and continuous need for innovation, it has been the Department’s ongoing endeavour to produce quality engineering graduates.\n"+
                        "Vision\n" +
                        "To be a distinguished academic and research Department in the field of Computer Science and Engineering for enabling students to be highly competent professionals to meet global challenges.\n" +
                        "Mission\n" +
                        "Impart quality education in Computer Science and Engineering through state-of-the art learning environment and committed faculty with research expertise.\n" +
                        "Train students to become the most sought-after professionals in the field of Information Technology by providing them strong theoretical foundation with adequate practical training.\n" +
                        "Provide a conducive environment for faculty and students to carry out research and innovation in collaboration with reputed research institutes and industry.\n" +
                        "Inculcate human values and professional ethics among students to enable them to become good citizens and serve the society."
            }
            ise.containsMatchIn(input=message)->
            {
                "The Department of Information Science and Engineering is established in the year 1999. The current intake is 120. Department is strengthened by well-qualified faculty members main aim is to emphasize the overall growth and development of students with cutting-edge technology by inculcating competence, commitment & teamwork. The Department comprises excellent infrastructure with well-equipped Laboratories, Classrooms, and Departmental Library.\n" +
                        "\n" +
                        "The Student forum SAMYOG is solely for the benefit of the student community established with the aim of by the students, of the students and from the students. The students actively take part in co-curricular activities like projects, paper & poster presentations, coding, debugging, etc. In the extra-curricular events like NSS, sports, college fest, and the preparation of technical magazines & newsletters. They are also participating in self-initiated outreach activities like YODHA , Book borrow.com, bookbeka.com, medical camps like blood donation camps, eye testing camps, dental camps, and Ayurvedic camps, etc. Industry interaction is established through MOUs. A good number of industrial visits, Invited lecturers, workshops, seminars, and webinars are also organized regularly in emerging technologies from experts of industries and institutions.\n" +
                        "\n" +
                        "Most of our students are well placed in fortune 500 companies. Our students have recorded very good performance in competitive examinations such as GATE, GRE, GMAT, TOEFL, CAT, PGCET, etc. Many of our Alumni joined MS programs in the leading and reputed Universities in the world.\n" +
                        "\n" +
                        "Further, most of the faculty members and students won the best paper awards, the best poster awards, the best project awards in National / International Conferences across the globe. Our faculty members and students are also members of professional societies like ISTE, CSI, IEEE, IEI, ACM., etc. Under the R & D activity, Faculty are engaged in the publication of research papers in top journals indexed in Web of Science and Scopus indexed journals. The research Promotion Scheme project sponsored by AICTE has been completed.\n"+
                        "Vision\n" +
                        "To emerge as a centre of academic excellence, by producing competent professionals to meet the global challenges in the field of Information Science and Technology\n" +
                        "Mission\n" +
                        "Prepare the competent professionals to meet the advancements in the industry and academia by imparting quality technical education.\n" +
                        "Enrich the technical ability of students to face the world with confidence, commitment and team-work.\n" +
                        "Inculcate and practice strong techno-ethical values."
            }
            mech.containsMatchIn(input=message)->{
                "The department established in the year 2004 offer’s B.E. program in Mechanical Engineering with an intake of 180 students, M. Tech in Thermal Engineering with an intake of 18 students. The Department is recognized as a Research Center by Visvesvaraya Technological University, Belagavi for pursuing M.Sc.Engg.(by Research)/Ph.D. either part-time/full-time. The B. E program is re-accredited again for 3 years by National Board of Accreditation (NBA), under Tier-II (According to Washington Accord) w.e.f. 01.07.2020 to 30.06.2023. The Department has established a Centre of Excellence with M/s. Toyota Kirloskar Motors Pvt. Ltd., Bengaluru, and M/s. ACE Micromatics Ltd., Bengaluru to provide hands-on training to the students in modern technology.\n"+
                        "Vision\n" +
                        "Be amongst the top Mechanical Engineering Department in the region by sculpting competent engineers through education and research.\n" +
                        "Mission\n" +
                        "Build strong foundation in Mechanical Engineering domain complemented with interdisciplinary skills.\n" +
                        "Develop state-of-the-art facilities with emphasis on industry interaction, consultancy, research and innovation.\n" +
                        "Enable to seek professional employment, pursue higher studies and promote entrepreneurship."
            }
            ele.containsMatchIn(input=message)->
            {
                "The Department of Electronics & Communication Engineering was started in the year 1997 with an intake of 60. Presently the intake of the Undergraduate Program is 180. Undergraduate Program is accredited 3 times and recent being in the year 2019-20 for 03 years. The Post Graduate M.Tech Course in VLSI Design & Embedded System was started in the year 2006 with an intake of 18 students.\n" +
                        "\n" +
                        "The Department is currently headed by Dr. P M Shivakumarswamy, M. Tech and Ph.D.. The Department has well-equipped laboratories, Departmental Library, IEEE-JSSATE Student Branch, ISTE and IETE Student Forum. Department is strengthened by well-qualified faculty members whose main aim is to make students aware of the cutting-edge technology with competence, commitment & teamwork. The Department has an excellent infrastructure for both Under Graduate and Post Graduate Degree with a separate Academic block. Continuous interaction with industries is established through sponsored projects & industrial visits.\n" +
                        "\n" +
                        "Invited lectures are organized regularly in the field of emerging technologies from industry and Academic experts. Also, IEEE technical fest is organized every year to provide a platform for the students to exhibit their talents. Industrial visits are organized as a part of the curriculum. The projects are carried out by the students in industries and the Department, covering all aspects of the Electronics and Communication Engineering field. Soft skills programs are conducted through Placement cell to improve the overall personality development of the students.\n" +
                        "\n" +
                        "The department faculty members have published around 175 journals & 150 conference papers. There are 14 faculty members with doctorate and 16 faculty who are pursuing the Ph.D. Two non-teaching staffs’ members are pursuing B.E under VTU & other universities.\n" +
                        "\n" +
                        "The research and Development Centre of the Electronics & Communication Engineering department was approved in July 2014. The R&D centre carries out fundamental research in selected areas of Power & control engineering, Signal & image processing, VLSI, Communication, Cryptography, Signal and Image Processing, Wireless Sensors Network, Fault Tolerance, Bio-medical Signal Processing, Machine Learning and Deep Learning., The R&D centre has many facilities like computers, internet facility, cadence software & the measuring instruments.\n" +
                        "\n" +
                        "Department has a good Alumni network and meet is conducted annually. Parents Teachers Meeting is conducted every semester. The department has excellent placement and around 80% of students are placed in reputed companies with an average package of 5 lakhs. Department has established industry assisted laboratories and the faculty have got funding of 80 lakhs from various funding agencies like VGST, TEQIP, KCTU a few to name.\n"+
                        "Vision\n" +
                        "Enable the students to achieve academic excellence at par with premier institutes and to meet the requirements of industry and research in the field of Electronics and Communication Engineering.\n" +
                        "Mission\n" +
                        "Enable the students to achieve academic excellence at par with premier institutes and to meet the requirements of industry and research in the field of Electronics and Communication Engineering.\n" +
                        "Impart knowledge in the emerging areas through industry-institute interaction, seminars, workshops, and conferences.\n" +
                        "Provide a strong foundation in core subjects to enable the students for continuous learning and research."
            }
            darshan.containsMatchIn(input=message)->{
                "yo"
            }



            else->{

                "I am sorry...I dont know about this....I promise to be updated the next we meet...\n"+
                        "Please Contact : Ph: 080 - 2861 2565 / 2861 1702\n" +
                        "\n" +
                        "Fax: 080 - 2861 2706 / 2861 2646\n"+
                        "Email address\n" +
                        "\n" +
                        "info@jssateb.ac.in\n" +
                        "\n" +
                        "principal@jssateb.ac.in"
            }
        }

    }
}