package com.example.property.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.property.R
import com.example.property.navigation.ROUT_ADDPRODUCT
import com.example.property.navigation.ROUT_HOME
import com.example.property.navigation.ROUT_PROPERTY
import com.example.property.navigation.ROUT_VIEWPRODUCT
import com.example.property.ui.theme.Purple40
import com.example.property.ui.theme.Purple41

@Composable
fun DashboardScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Spacer(modifier = Modifier.height(5.dp))

        Image(
            painter = painterResource(id = R.drawable.icon1),
            contentDescription = "home",
            modifier = Modifier
                .size(200.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(10.dp))


        Text(
            text = "Manage your property with ease.",
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif,
        )

        Spacer(modifier = Modifier.height(15.dp))

        Column (modifier = Modifier.verticalScroll(rememberScrollState())){
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(700.dp),
                shape = RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp ),
                colors = CardDefaults.cardColors(Purple41)
            ) {
                //row1

                Row (modifier = Modifier.padding(20.dp)){
                    //Card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable {
                            navController.navigate(ROUT_HOME)
                        },
                        elevation = CardDefaults.cardElevation(10.dp)

                        ){
                        Column {

                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Spacer(modifier = Modifier.height(10.dp))

                                Image(
                                    painter = painterResource(id = R.drawable.icon3) ,
                                    contentDescription = "home",
                                    modifier = Modifier.size(120.dp)
                                )

                            }
                            Text(
                                text = "Home",
                                fontSize = 25.sp,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }

                    }
                    //End of Card

                    Spacer(modifier = Modifier.width(30.dp))

                    //Card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable {
                            navController.navigate(ROUT_PROPERTY)
                        },
                        elevation = CardDefaults.cardElevation(10.dp)
                    ){
                        Column {

                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Spacer(modifier = Modifier.height(10.dp))

                                Image(
                                    painter = painterResource(id = R.drawable.icon6) ,
                                    contentDescription = "home",
                                    modifier = Modifier.size(120.dp)
                                )

                            }
                            Text(
                                text = "Property",
                                fontSize = 25.sp,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }

                    }



                }


                //End of row1

                Spacer(modifier = Modifier.height(15.dp))

                //Row2
                Row (modifier = Modifier.padding(20.dp)){
                    //Card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(10.dp)


                    ){
                        Column {

                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Spacer(modifier = Modifier.height(10.dp))

                                Image(
                                    painter = painterResource(id = R.drawable.icon4) ,
                                    contentDescription = "home",
                                    modifier = Modifier.size(120.dp)
                                )

                            }
                            Text(
                                text = "Setting",
                                fontSize = 25.sp,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }

                    }
                    //End of Card

                    Spacer(modifier = Modifier.width(30.dp))

                    //Card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp),
                        elevation = CardDefaults.cardElevation(10.dp)
                    ){
                        Column {

                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Spacer(modifier = Modifier.height(10.dp))

                                Image(
                                    painter = painterResource(id = R.drawable.icon5) ,
                                    contentDescription = "home",
                                    modifier = Modifier.size(120.dp)
                                )

                            }
                            Text(
                                text = "Profile",
                                fontSize = 25.sp,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }

                    }



                }

                //End of row2

                Spacer(modifier = Modifier.height(15.dp))

                //Row3
                Row (modifier = Modifier.padding(20.dp)){
                    //Card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable {
                            navController.navigate(ROUT_ADDPRODUCT)
                        },
                        elevation = CardDefaults.cardElevation(10.dp)
                    ){
                        Column {

                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Spacer(modifier = Modifier.height(10.dp))

                                Image(
                                    painter = painterResource(id = R.drawable.icon3) ,
                                    contentDescription = "home",
                                    modifier = Modifier.size(120.dp)
                                )

                            }
                            Text(
                                text = "Add Product",
                                fontSize = 25.sp,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }

                    }
                    //End of Card

                    Spacer(modifier = Modifier.width(30.dp))

                    //Card
                    Card(modifier = Modifier
                        .width(160.dp)
                        .height(180.dp)
                        .clickable {
                            navController.navigate(ROUT_VIEWPRODUCT)
                        },
                        elevation = CardDefaults.cardElevation(10.dp)
                    ){
                        Column {

                            Box (modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                                Spacer(modifier = Modifier.height(10.dp))

                                Image(
                                    painter = painterResource(id = R.drawable.icon3) ,
                                    contentDescription = "home",
                                    modifier = Modifier.size(120.dp)
                                )

                            }
                            Text(
                                text = "View Product",
                                fontSize = 25.sp,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }

                    }



                }

                //End of row3



            }
        }




    }

}

@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())}

